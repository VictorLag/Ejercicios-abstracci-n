public class MaincomparetoRectangulo {
    public static void main(String[] args) {

        Rectangulo rec1=new Rectangulo(4,4.5,3.5);
        Rectangulo rec2=new Rectangulo(4,4.5,3.5);

        if (rec1.compareTo(rec2)<0){
            System.out.println("rec1 es menos grande que rec2");
        }
        else if (rec1.compareTo(rec2)>0){
            System.out.println("rec1 es mas grande que rec2");
        }
        else {
            System.out.println("Los dos rectangulos son iguales");
        }
    }
}
