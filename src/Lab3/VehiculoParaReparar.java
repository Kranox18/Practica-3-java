package Lab3;

public class VehiculoParaReparar extends Vehiculo{

    private String averia;
    private boolean reparado;
    private int prioridad;

    public VehiculoParaReparar(String marca, String modelo, String matricula, String averia, int prioridad) {
        super(marca, modelo, matricula);
        this.averia = averia;
        this.prioridad = prioridad;
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
        this.prioridad = prioridad;
    }

    //gemini
    @Override
    public VehiculoVenta clone() {
        try {
            // Llamamos al clone de la superclase (Vehiculo)
            // que a su vez llamó a Object.clone()
            return (VehiculoVenta) super.clone();
        } catch (CloneNotSupportedException e) {
            // Esto no debería pasar si implementamos Cloneable
            return null;
        }
    }




}
