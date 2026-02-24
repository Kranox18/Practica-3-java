package Lab3;

public class Restaurante extends Comercio{
    private String[] menuDiario;
    private int numMesas;
    private int capacidad;

    public Restaurante(){}

    public Restaurante(String[] menuDiario, int numMesas, int capacidad) {


        this.menuDiario = menuDiario;
        this.numMesas = numMesas;
        this.capacidad = capacidad;
    }

    public String[] getMenuDiario() {
        return menuDiario;
    }

    public void setMenuDiario(String[] menuDiario) {
        this.menuDiario = menuDiario;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    //metodos








}
