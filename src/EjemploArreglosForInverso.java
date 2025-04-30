import java.util.Arrays;

public class EjemploArreglosForInverso {
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
        for (int i = 0; i > total; i++ ){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("========Usando for Inverso===========");
        for (int i = 0; i < total; i++){
            System.out.println("Para i = " + (total-1-i) +" valor: " + productos[total -1-i]);
        }

        System.out.println("========Usando for Inverso 2===========");
      for (int i = total - 1; i >= 0; i--){
            System.out.println("para i = " + i + " valor " + productos[i]);
    }
        }





    }
