import java.util.Arrays;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {



        String [] productos = {"Kingstong","Samsung Galaxy","Disco duro ssd samsung externo",
                "Asus notebook","Macbook air","Chromecast 4ta generacion","Bicicleta oxford"};

        int total = productos.length;

        Arrays.sort(productos); //ordena alfabeticamente
        System.out.println("=======Usando For=========");
        for (int i = 0; i < total; i++ ){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        for (int i = 0; i < total/2; i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }

        System.out.println("=======Usando For=========");
        for (int i = 0; i < total; i++ ){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}






