import java.util.Scanner;

public class ejemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaNotasMatematicas = 0, sumaNotasHistoria = 0, sumaNotasLenguaje = 0;


        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < claseMatematicas.length; i++) {
            System.out.println("Ingresa 7 notas de estudiantes de Matematicas");
            claseMatematicas[i] = s.nextDouble();
        }
        for (int i = 0; i < claseHistoria.length; i++) {
            System.out.println("Ingresa 7 notas de estudiantes de Historia");
            claseHistoria[i] = s.nextDouble();
        }
        for (int i = 0; i < claseLenguaje.length; i++) {
            System.out.println("Ingresa 7 notas de estudiantes de Lenguaje");
            claseLenguaje[i] = s.nextDouble();
        }
        for (int i = 0; i < 7; i++){
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }
        double promedioMatematicas = (sumaNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumaNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumaNotasLenguaje/claseLenguaje.length);
        double promedioTotal = (promedioMatematicas + promedioHistoria + promedioLenguaje /3);

        System.out.println("Promedio clase Matematicas = " +promedioMatematicas);
        System.out.println("Promedio clase Historia = " +promedioHistoria);
        System.out.println("Promedio clase Lenguaje = " +promedioLenguaje);
        System.out.println("Promedio total Materias = "+promedioTotal);

        System.out.println("Ingrese el identificador del alumno de 0 a 6");
        int id = s.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]);
        System.out.println("Alumno: "+id + "su promedio es = " +promedioAlumno);

    }
}

