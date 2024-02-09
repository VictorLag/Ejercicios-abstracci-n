public class Estudiante implements Comparable<Estudiante>{

    private String nombre;
    private int edad;
    private int altura;




    public Estudiante (String nombre,int altura, int edad){

        this.nombre=nombre;
        this.altura=altura;
        this.edad=edad;

    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", altura= " + altura +
                ", edad= " + edad +
                '}';
    }

    @Override
    public int compareTo(Estudiante o) {

        int resultado=0;

        if (this.altura<o.altura){
            resultado=1;
        }
        else if (this.altura>o.altura){
            resultado=-1;
        }

        else {

            if (this.edad<o.edad){
                resultado=1;
            }
            else if (this.edad>o.edad){
                resultado=-1;
            }

            else {
                resultado=0;
            }

        }

        return resultado;
    }
}
