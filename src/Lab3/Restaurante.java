package Lab3;

public class Restaurante extends Comercio{
    private String[] menuDiario;
    private int numMesas;
    private int capacidad;


    public Restaurante(String nombre, String cif, String direccion, int n, String[] menuDiario, int numMesas, int capacidad) {

        super(nombre, cif, direccion, n);

        this.numMesas = numMesas;
        this.capacidad = capacidad;
        this.menuDiario = new menuDiario[7];

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

    public void








}
