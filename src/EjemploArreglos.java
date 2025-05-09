import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingstong";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro ssd samsung externo";
        productos[3] = "asus notebook";
        productos[4] = "Macbook air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "bicicleta oxford";

        Arrays.sort(productos); //ordena alfabeticamente


        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos [0] = " + prod1);
        System.out.println("productos [1] = " + prod2);
        System.out.println("productos [2] = " + prod3);
        System.out.println("productos [3] = " + prod4);
        System.out.println("productos [4] = " + prod5);
        System.out.println("productos [5] = " + prod6);
        System.out.println("productos [6] = " + prod7);




        int [] numeros = new int[4]; //aqui es donde se define el tamaño del arreglo
        //no se pueden asignar mas valores de los que se establecieron en el tamaño del arreglo

        numeros [0] = 10;
        numeros [1] = Integer.valueOf("7");
        numeros [2] = 35;
        numeros [3] = -1;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        //no se puede leer mas valores del tamaño definido por el arreglo

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}