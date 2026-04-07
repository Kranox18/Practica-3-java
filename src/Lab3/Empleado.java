package Lab3;

public class Empleado implements Cloneable {
    private String DNI;
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;
    private String fechaInicio;
    private double salario;
    private String cargo;


    public Empleado(String DNI, String nombre, String direccion, int telefono, String email, String fechaInicio, double salario, String cargo) {
        setDireccion(direccion);
        setCargo(cargo);
        setEmail(email);
        setNombre(nombre);
        setFechaInicio(fechaInicio);
        setSalario(salario);
        setTelefono(telefono);
        setDNI(DNI);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if(direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        }

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {

        if(telefono>0){
        this.telefono = telefono;}





    }

    public String getEmail() {

            return email;

    }

    public void setEmail(String email) {
        if(email != null && !email.trim().isEmpty() && email.contains("@")) {
            this.email = email;
        }
    }

    public String getFechaInicio() {

        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        if(fechaInicio != null && !fechaInicio.trim().isEmpty()) {
            this.fechaInicio = fechaInicio;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario>0)
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if(cargo != null && !cargo.trim().isEmpty()) {
            this.cargo = cargo;
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        if(DNI!= null && DNI.trim().length()>0){
            this.DNI = DNI;
        }

    }


@Override
    public String toString(){
        String s;
        s="";
        s+="Nombre: "+ nombre+"\n";
        s+="direccion: " + direccion+"\n";
        s+= "telefono: "+ telefono+"\n";
        s+= "email: " + email+"\n";
        s+= "fecha de inicio: "+ fechaInicio+"\n";
        s+="salario: " + salario+"\n";
        s+= "cargo: " + cargo+"\n";
        s+="Dni: " + DNI+"\n";
        return s;

    }

    public boolean equals(Object obj){

       if(obj == null) return false;
       if(this == obj) return true;

//       if(obj.getClass() != getClass()) return false;  es como abajo, explicado en  tema 3
       if(obj instanceof Empleado) return false;

       Empleado emp= (Empleado) obj;
       return this.getDNI().equals(emp.getDNI());
    }
// lo veremos luego
    public Object clone() throws CloneNotSupportedException{
        try{
        return (Empleado) super.clone();

        }catch (CloneNotSupportedException e){
            return null;
        }
    }

}
