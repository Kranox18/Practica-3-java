package Lab3;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca != null && !marca.trim().isEmpty())

        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




    @Override
    public String toString() {
        String s = "";
        s += " marca: ";
        s += this.marca;
        s += " modelo: ";
        s += this.modelo;

        return s;
    }

    public boolean equals(Object o) {

        if (o == null) return false;
        if (o ==this ) return true;
        if(o instanceof Vehiculo) return false;

        Vehiculo v= (Vehiculo) o;

        return this.getMarca().equals(v.getMarca()) && this.getModelo().equals(v.getModelo());


    }

// gemini
    @Override
    public Object clone() throws CloneNotSupportedException {
        // super.clone() se encarga de copiar los atributos primitivos y Strings
        return super.clone();
    }
//    public Vehiculo clone(){
//        Vehiculo otro;
//        this.marca = otro.marca;
//        this.modelo = otro.modelo;
//        this.matricula = otro.matricula;
//
//    return otro;

}

