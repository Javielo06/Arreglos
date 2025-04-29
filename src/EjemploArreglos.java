public class EjemploArreglos {
    public static void main(String[] args) {

        int [] numeros = new int[4]; //aqui es donde se define el tamaño del arreglo
        //no se pueden asignar mas valores de los que se establecieron en el tamaño del arreglo

        numeros [0] = 1;
        numeros [1] = 2;
        numeros [2] = 3;
        numeros [3] = 4;

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