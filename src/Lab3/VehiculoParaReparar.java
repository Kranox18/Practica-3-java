package Lab3;

public class VehiculoParaReparar extends Vehiculo{

    private String averia,matricula;
    private boolean reparado;
    private int prioridad;

    public VehiculoParaReparar(String marca, String modelo, String matricula, String averia, int prioridad) {
        super(marca, modelo);
        this.averia = averia;
        this.matricula = matricula;
        setPrioridad(prioridad);
        this.reparado = false;
    }

    public VehiculoParaReparar(String marca, String modelo, String averia,String matricula){


        this(marca, modelo, averia, matricula, 3);
    }


    public String getAveria() {
        return averia;
    }

    public void setAveria(String averia) {
        this.averia = averia;
    }

    public boolean isReparado() {
        return reparado;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {

        if (prioridad >=1 && prioridad <=3)
        this.prioridad = prioridad;
        else{
            System.out.println("prioridad incorrecta ("+ prioridad + ")" + "no se ha establecido ningun valor");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean equals(Object o) {

        if (o== null) return false;
        if(o== this) return true;
        if(o.getClass() != this.getClass()) return false;

        VehiculoParaReparar v = (VehiculoParaReparar) o;

        return (super.equals(o) && v.averia.equals(averia) && v.matricula.equals(matricula) && v.reparado == this.reparado && v.prioridad== prioridad);


    }



    //gemini
    @Override
    public VehiculoParaReparar clone() {
        try {
            // Llamamos al clone de la superclase (Vehiculo)
            // que a su vez llamó a Object.clone()
            return (VehiculoParaReparar) super.clone();
        } catch (CloneNotSupportedException e) {
            // Esto no debería pasar si implementamos Cloneable
            return null;
        }
    }




}
