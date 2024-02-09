public class Rectangulo extends Forma implements Redimensionable,Comparable <Rectangulo>{

    private double ancho;
    private double alto;



    public Rectangulo (int numLados, double ancho, double alto){

        super(4);

        this.ancho=ancho;
        this.alto=alto;

    }


    @Override
    public double getArea() {

        double arearec= ancho*alto;
        
        return arearec;

    }

    @Override
    public double getPerimeter() {

        double perimrec = (ancho*2) + (alto*2);

        return perimrec;

    }

    @Override
    public int redimensionar(int x) {

        ancho=x;
        alto=x;

        return x;
    }

    @Override
    public int compareTo(Rectangulo o) {

        int result=0;


        if (getArea()<o.getArea()){
            result= -1;
        }
        else if (getArea()>o.getArea()){
            result= 1;
        }
        else {
            if (getArea()<o.getArea()){
                result= -1;
            }
            else if (getArea()>o.getArea()){
                result= 1;
            }
            else { result =0;}
        }

        return result;
    }
}
