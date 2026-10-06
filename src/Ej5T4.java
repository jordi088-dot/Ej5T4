import java.util.Scanner;
public class Ej5T4 {

        //  Atributos

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array; // Declaración
        array =  new int[10]; // instanciación
        // Inicialización
        System.out.println("Introduce 10 valores enteros: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Orden inverso: ");
        for(int i = 9; i >= 0; i--) {
            System.out.println("Elemento indice " + i + " = " + array[i]);
        }

    }
}
