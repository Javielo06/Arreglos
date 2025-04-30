import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {

        int a [] = new int [7];

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa 7 numeros ");
        for (int i = 0; i < a.length; i++){
        a[i] = s.nextInt();
        }
        boolean ascendente = false;
        boolean desendente = false;
        for (int i = 0; i < a.length -1; i++ ){
            if (a[i] > a[i+1]){
                desendente = true;
            }
            if (a[i] < a[i+1]){
                ascendente = true;
            }
        }

        if (ascendente == true && desendente == true){
            System.out.println("Arreglo desordenado");
        }
        if (ascendente == false && desendente == false){
            System.out.println("Son todos iguales");
        }
        if (ascendente == true && desendente == false){
            System.out.println("Arreglo ordenado de forma ascendente");
        }
        if (ascendente == false && desendente == true){
            System.out.println("Arreglo ordenado de forma desendente");
        }
    }
}
