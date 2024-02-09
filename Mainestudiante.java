import java.util.Arrays;

public class Mainestudiante {
    public static void main(String[] args) {

        Estudiante[] array= new Estudiante[5];

        System.out.println("Sin ordenar");

        array[0]=new Estudiante("Patri",170,12);
        array[1]=new Estudiante("Manuel",173,43);
        array[2]=new Estudiante("Javier",189,72);
        array[3]=new Estudiante("Alicia",168,52);
        array[4]=new Estudiante("Alberto",189,35);

        for (int cont=0;cont<=4;cont++){
            System.out.println(array[cont].toString());
        }

        System.out.println("Ordenado");

        Arrays.sort(array);
        for (int num=0;num<=4;num++){
            System.out.println(array[num]);
        }
        
    }

}
