import java.util.Scanner;

public class forr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("Hola introduce la opción que desees");

        System.out.println("0, Llamar a técnico");
        System.out.println("1, Llamar a responsable comercial");
        System.out.println("2, Llamar a recursos humanos");

        for(int i=0; i<3; i++){
            System.out.println("Introduzcan una opción: ");
            option = scanner.nextInt();
            switch (option){
                case 0:
                    System.out.println("0, llamando al técnico");
                    break;
                case 1:
                    System.out.println("1, llamando a responsable comercial");
                    break;
                case 2:
                    System.out.println("2, llamando a recursos humanos");
                    break;
                default:
                    System.out.println("2, Llamar a recursos humanos");
            }
        }
    }
}
