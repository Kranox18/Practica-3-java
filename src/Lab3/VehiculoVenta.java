package Lab3;

public class VehiculoVenta extends Vehiculo{

    private double precio;
    private int descuento;



    public VehiculoVenta(String marca, String modelo, String matricula, double precio, int descuento) {
        super(marca, modelo, matricula);
        this.precio = precio;
        this.descuento= descuento;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
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
