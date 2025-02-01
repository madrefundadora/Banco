
package banco;

public class Main {
    static Cuenta cuenta1;
    static double ingreso = 600;
    static double retiro = 2000;


    public static void main(String[] args) { //esto es un comentario para hacer cambios y volverlos a subir

        cuenta1 = new Cuenta("Antonio López", "1000-2365-85-1230456789", 2500);
        System.out.println(cuenta1.toString());
        System.out.println("\nEl saldo actual es: "+ cuenta1.saldo);
    

        float cantidad = 1000;

        try {
        	System.out.println("Retiramos " + retiro + " en cuenta");
            cuenta1.retirar(retiro);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingresamos " + ingreso + " en cuenta");
            cuenta1.ingresar(ingreso);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        

        System.out.println("El saldo actual es: "+ cuenta1.saldo);
    }
}
}
