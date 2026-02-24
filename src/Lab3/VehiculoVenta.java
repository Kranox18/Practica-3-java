package Lab3;

public class VehiculoVenta extends Vehiculo{

    private double precio;
    private int descuento;



    public VehiculoVenta(String marca, String modelo, String matricula, double precio, int descuento) {
        super(marca, modelo, matricula);
        this.precio = precio;
        this.descuento= descuento;

    }
}
