public abstract class Forma {

    protected int numLados;

    public int getNumLados() {
        return numLados;
    }

    public abstract double getArea();

    public abstract double getPerimeter();


    public Forma(int numLados) {
        this.numLados = numLados;
    }


}











