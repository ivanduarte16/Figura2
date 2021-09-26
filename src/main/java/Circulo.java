public class Circulo extends Figura{

    //Atributos
    private double Radio;

    public Circulo(int id, String borde, String relleno, Punto origen, double radio) {
        super(id, borde, relleno, origen);
        Radio = radio;
    }

    @Override
    double area() {
        return Math.PI*(Radio*Radio);
    }

    @Override
    double perimetro() {
        return 2*Math.PI*Radio;
    }

    @Override
    void escalar(int porcentaje) {
        Radio=(porcentaje/100)*Radio;
    }

    @Override
    public String toString() {
        return "Circulo"+"con el id "+this.getId()+" y en la posicion "+this.getOrigen() ;
    }

    @Override
    public void dibujar() {

    }

    @Override
    public void rellenar() {

    }


    @Override
    public int compareTo(Figura figura) {
        return (int) (this.area()- figura.area());
    }
}
