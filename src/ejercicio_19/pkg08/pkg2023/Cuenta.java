
package ejercicio_19.pkg08.pkg2023;


public class Cuenta {
    
    String nombre , apellido;
    int saldo;

    public Cuenta(String nombre, String apellido, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }

       
    public void debito(int debito){
        saldo  -= debito;
    }
    
    public void credito (int credito){
        saldo += credito;
    }

    public void mostrar() {
        System.out.println("-------------------------");
        System.out.println("nombre: " + this.nombre);
        System.out.println("apellido: " + this.apellido);
        System.out.println("saldo: " + this.saldo);
        System.out.println("-------------------------");
    }
    
    
    
}
