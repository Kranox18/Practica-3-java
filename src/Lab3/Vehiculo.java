package Lab3;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String matricula;

    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        String s = "";
        s += " marca: ";
        s += this.marca;
        s += " modelo: ";
        s += this.modelo;
        s += " matricula: ";
        s += this.matricula;
        return s;
    }

    public boolean equals(Vehiculo otro) {

        if (otro == null) return false;

        return this.marca == otro.marca && this.modelo == otro.modelo && this.matricula == matricula;

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

