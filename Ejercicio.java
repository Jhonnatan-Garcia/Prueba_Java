import java.util.Scanner;

public class Ejercicio{

        public static void main(String[] args){


            int[] array;

            Scanner captura = new Scanner(System.in);

            System.out.println("Ingresa el tamano: ");

            int tamano = captura.nextInt();

            array = new int[tamano];

            //Llenar array

            System.out.println("Ingresa los datos del array: ");

            for(int i = 0; i < array.length; i++){

                array[i] = captura.nextInt();

            }

          

            

        }

}