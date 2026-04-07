package Lab3;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Comercio {

    private String nombre;
    private String direccion;
    private String cif;
    private double[][] ventasDiarias;
    private Empleado[] empleados;

    public Comercio(String nombre, String cif, String direccion, int n) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
        empleados = new Empleado[n];
        ventasDiarias = new double[12][31];

    }



    public Comercio(Comercio otro) {
        this.nombre = otro.getNombre();
        this.cif= otro.getCif();
        this.direccion = otro.getDireccion();

        empleados= new Empleado[otro.empleados.length];
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i] == null) break;
            try {

                empleados[i] = (Empleado) (otro.empleados[i]).clone();

            }catch(CloneNotSupportedException e){
                System.out.println(e);
            }
        }
        //copiar ventas diarias
         this.ventasDiarias = new double[12][31];
        for (int i = 0; i < ventasDiarias.length; i++) {
            for (int j = 0; j < ventasDiarias[i].length; j++) {
                ventasDiarias[i][j] = otro.ventasDiarias[i][j];
            }




        }


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }


    public void actualizarVentas(int m, int d, double v) {

        if (m >= 1 && m <= 12 && d >= 1 && d <= 31) {

            ventasDiarias[m - 1][d - 1] += v; // el -1 es para que enero sea 1 y no 0

        }

    }

    public double calcularVentasMes(int m){
    double suma=0;



    if(m<= 0 || m>12) throw new IllegalArgumentException("mes malo "+m);

        for (int i = 0; i < ventasDiarias[m].length; i++) {
            suma+= ventasDiarias[m-1][i];

        }
       // for(double v : ventasDiarias[m]){suma+=v;}  // hace lo mismo de arriba, es un for each


        return suma;

    }

    public double calcularVentasMes(){
        int m= LocalDate.now().getMonthValue();
        return calcularVentasMes(m);
    }




    public double CalcularTotalVentas(){
        double suma=0;
        for (int i = 1; i <=12 ; i++) {
            suma+=calcularVentasMes(i);
        }
        return suma;
    }

    public double mesConMasVentas(){
        double max= calcularVentasMes(1);
        for (int i = 1; i <= 12; i++) {

            if(max < calcularVentasMes(i)){
                max= calcularVentasMes(i);

            }

        }
        return max;
    }
    private int buscarFreeSlot(){

        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i]== null) return i;

        }
        return -1; //-1 si no hay empleado sino devuelve el indice del empleado
    }

    public void contratarEmpleado(Empleado emp){

        int slot = buscarFreeSlot();
        if(slot != -1) empleados[slot] = emp;
        else {//tengo que aumentar en 10 la long del array de empleados
            Empleado[] nuevo = new Empleado[empleados.length+10];
            for (int i = 0; i < empleados.length; i++) {
                nuevo[i] = empleados[i];
            }
            nuevo[empleados.length]=emp;// importante, pq es cuando añado el empleado nuevo y no los que ya tenia
            empleados = nuevo;          // importante, es para que empleados apunte a nuevo
             }

    }


    public void darDeBajaEmpleado(String dni){

        for (int i = 0; i < empleados.length ; i++) {
            if(empleados[i].getDNI().equals(dni)){

                //hay que compactar

                for (int k = 0; k < empleados.length-1; k++) {
                    empleados[k]= empleados[k+1];
                }
                empleados[empleados.length-1]= null;
            }
        }
    }


}
