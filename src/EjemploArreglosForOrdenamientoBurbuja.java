import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {

        String [] productos = {"Kingstong","Samsung Galaxy","Disco duro ssd samsung externo",
                "Asus notebook","Macbook air","Chromecast 4ta generacion","Bicicleta oxford"};

        int total = productos.length;

        int contador = 0;

        for (int i = 0; i < total; i++){
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        //Arrays.sort(productos); //ordena alfabeticamente

        System.out.println("contador = " + contador);
        System.out.println("=======Usando For=========");
        for (int i = 0; i < total; i++ ){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}






