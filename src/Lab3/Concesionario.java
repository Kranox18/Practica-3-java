package Lab3;

public class Concesionario extends Comercio {

    private VehiculoVenta[] v;
    private VehiculoParaReparar[] r;


    public Concesionario(String nombre, String cif, String direccion, int n) {

        super(nombre, cif, direccion, n);
        r = new VehiculoParaReparar[10];
        v = new VehiculoVenta[10];


    }

    public Concesionario(Concesionario otro) {

        super(otro);
        //copiar vehiculos para reparar

        this.r = new VehiculoParaReparar[otro.r.length];
        for (int i = 0; i < r.length; i++) {

            r[i] = (VehiculoParaReparar) (otro.r[i]).clone();
        }
        this.v = new VehiculoVenta[otro.v.length];
        for (int i = 0; i < v.length; i++) {
            v[i] = (VehiculoVenta) otro.v[i].clone();
        }


    }

    private int buscarFreeSlot() {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void añadirVehiculo(VehiculoVenta otro) {

        int slot = buscarFreeSlot();


        if (slot != -1) v[slot] = otro;
        else {
            VehiculoVenta[] nuevo = new VehiculoVenta[v.length + 10];
            for (int i = 0; i < v.length; i++) {
                nuevo[i] = v[i];
            }
            nuevo[v.length] = otro;
            v = nuevo;

        }
    }

    public void añadirReparar(VehiculoParaReparar v) {

        if (v == null) return;
        //si r esta lleno, amplio y copio, insertando en el lugar arpopiado para v
        VehiculoParaReparar[] raux = new VehiculoParaReparar[r.length + 5];
        if (r[r.length - 1] != null) {
            int i = 0;
            while (i < r.length && r[i].getPrioridad() <= v.getPrioridad()) {

                raux[i] = r[i];
                i++;
            }
            // copio el vehiculo que me han paso en su correspondiente posicion
            raux[i] = v;
            // sigo copiando el resto de vehiculos que ya tenia pero despues de colocar el vehiculo que me han dado
            for (int j = i + 1; j < raux.length; j++) {
                raux[j] = r[j];
            }
            /* lo del profe que es lo mio de arriba (for)
             * while(i<r.lenght){
             * raux[i+1]= r[i]
             * i++
             * }
             * */

            r = raux;
        }




        else{//
            int i = 0;
            while (i < r.length && r[i].getPrioridad() <= v.getPrioridad()) {
                i++;
            }
            //aqui se puede preguntar que si r[i] es null insertar ya

            for (int j = r.length-1; j >i; j--) {
                r[j]= r[j-1];
            }
            r[i]= v;
        }

    }


}
