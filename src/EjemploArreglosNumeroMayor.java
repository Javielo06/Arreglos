import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {
         int [] a = new int [3];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa 5 numeros enteros: " );
        for (int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        int max = 0;
        for (int i = 1; i < a.length; i++){
            max = (a[max] > a[i]) ? max: i;
        }
        System.out.println("max = " + a[max]);
    }
}
