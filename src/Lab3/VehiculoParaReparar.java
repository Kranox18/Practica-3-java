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




}
