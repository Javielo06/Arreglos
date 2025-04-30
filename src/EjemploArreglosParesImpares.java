import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
       int [] a, pares, impares;
       int totalPares = 0, totalImpares = 0;
       a = new int [10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            a [i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++){
            if ( a[i] % 2 == 0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new  int [totalPares];

    }
}
