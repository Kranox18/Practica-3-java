package Lab3;

public class Main {
    public static void main(String[] args) {

        Vehiculo v= new VehiculoVenta("ferrari","3","1867V", 200, 0);
        Empleado ed= new Empleado("4378582F","pedro","pedro coca",345483234,"karkamblack24@gmail.com","13/2/26",3200,"empleado");

        System.out.println(ed.toString());

//        Vehiculo v1 = new Vehiculo("BMW", "X3");
//        try{
//         Vehiculo v2 =(Vehiculo) v1.clone();
//            System.out.println(" v1 y v2 son iguales" + v1.equals(v2));
//        }catch (Exception e){
//            System.out.println(e);
//        }



    }
}
