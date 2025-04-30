import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingstong";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro ssd samsung externo";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta oxford";

        Arrays.sort(productos); //ordena alfabeticamente
        System.out.println("=======Usando For=========");
        for (int i = 0; i < total; i++ ){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("=======Usando Foreach=========");

        for (String prod: productos ){
            System.out.println("prod = " + prod);
        }

        int i = 0;
        System.out.println("========= Usando While======= ");
        while (i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("========= Usando DoWhile======= ");

        int j = 0;
        do {
            System.out.println("Para indice " + i + " : " + productos[j]);
            i++;
        }while (i < total);


        System.out.println("========= Usando for======= ");
        for(int l = 0;total < l; l++){
            System.out.println("Para indice " + l + " : " + productos[l]);
        }

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




        int [] numeros = new int[10];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;

        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++){

        }

        int num1 = numeros[0];
        int num2 = numeros[1];
        int num3 = numeros[2];
        int num4 = numeros[3];
        int num5 = numeros[4];
        int num6 = numeros[5];
        int num7 = numeros[6];
        int num8 = numeros[6];


        System.out.println("numero [0] = " + num1);
        System.out.println("numero [1] = " + num2);
        System.out.println("numero [2] = " + num3);
        System.out.println("numero [3] = " + num4);
        System.out.println("numero [4] = " + num5);
        System.out.println("numero [5] = " + num6);
        System.out.println("numero [6] = " + num7);

    }
}