public class Rectangulo extends Figura {

    //Atributos
    private double Altura;
    private double Base;

    public Rectangulo(int id, String borde, String relleno, Punto origen, double altura, double base) {
        super(id, borde, relleno, origen);
        Altura = altura;
        Base = base;
    }

    @Override
    double area() {
        return  Altura * Base;
    }

    @Override
    double perimetro() {
        return (Altura*2)+(Base*2);
    }

    @Override
    void escalar(int porcentaje) {
        Altura=(porcentaje/100)*Altura;
        Base=(porcentaje/100)*Base;
    }

    @Override
    public String toString() {
        return "Rectangulo "+"con el id "+this.getId()+" y en la posicion "+this.getOrigen();
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
