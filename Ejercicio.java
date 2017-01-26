import java.util.Scanner;
import java.util.Random;

public class Ejercicio{

        public static void main(String[] args){


            int[] array;

            Random random = new Random();

            Scanner captura = new Scanner(System.in);

            System.out.println("Ingresa el tamano: ");

            int tamano = captura.nextInt();

            array = new int[tamano];

            //Llenar array

            System.out.println("Llenado automatico array: ");

            for(int i = 0; i < array.length; i++){

                array[i] = random.nextInt(30);

            }

            //Impresion De array

        for(int i = 0; i < array.length; i++){

            System.out.println("Psicion: " + i + "Valor: " + array[i]);

        }

        //Agregar un 2 array

        int[] array2;

        

          

            

        }

}