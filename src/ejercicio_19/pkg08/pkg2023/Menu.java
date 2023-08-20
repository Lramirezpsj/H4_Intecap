package ejercicio_19.pkg08.pkg2023;


import java.util.Scanner;

public class Menu {

    public static void ejecucion() {

        Cuenta obj1 = new Cuenta("Luis", "Ramirez", 500);
        Cuenta obj2 = new Cuenta("Sandra", "Ramirez", 800);

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("**********************");
            System.out.println("*  1. Mostrar cuenta *");
            System.out.println("*  2. Abonar cuenta  *");
            System.out.println("*  3. Debitar cuenta *");
            System.out.println("*  4. Salir          *");
            System.out.println("**********************" + "\n");
            
            int opcion = entrada.nextInt();
            
 
            switch (opcion) {
                case 1:
                   System.out.println("Ingresa si quieres cuenta 1 o 2 ");
                   int mostrar = entrada.nextInt();
                   if(mostrar == 1){
                   obj1.mostrar();
                   }else{
                   obj2.mostrar();
                   }
                    break;
                case 2:
                    System.out.println("Ingresa si quieres cuenta 1 o 2 ");
                    int abono = entrada.nextInt();
                    System.out.println("Cuanto deseas depositar: ");
                    if(abono == 1){
                      obj1.credito(entrada.nextInt());
                        System.out.println("Deposito efectuado con éxito" + "\n");
                    }else{
                    obj2.credito(entrada.nextInt());
                    System.out.println("Deposito efectuado con éxito" + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa si quieres cuenta 1 o 2 ");
                    int retiro = entrada.nextInt();
                    System.out.println("Cuanto deseas retirar: ");              
                    if(retiro == 1){
                      obj1.credito(entrada.nextInt());
                      System.out.println("Retiro efectuado con éxito" + "\n");
                    }else{
                    obj2.credito(entrada.nextInt());
                    System.out.println("Retiro efectuado con éxito" + "\n");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por preferirnos ¡Hasta luego!");
                    entrada.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
        
    }
    public static void main(String[] args) {
        Menu.ejecucion();
    }
}
