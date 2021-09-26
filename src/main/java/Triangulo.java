public class Triangulo extends Figura {

    //Atributos
    private double base;
    private double altura;
    private double hipotenusa;

    public Triangulo(int id, String borde, String relleno, Punto origen, double base, double altura) {
        super(id, borde, relleno, origen);
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }

    @Override
    double area() {
        return (this.base*this.altura)/2;
    }

    @Override
    double perimetro() {
        return this.hipotenusa+this.altura+this.base;
    }

    @Override
    void escalar(int porcentaje) {
        this.hipotenusa=(porcentaje/100)*hipotenusa;
        this.altura=(porcentaje/100)*this.altura;
        this.base=(porcentaje/100)*this.base;
    }

    @Override
    public String toString() {
        return "Triangulo "+"con el id "+this.getId()+" y en la posicion "+this.getOrigen();
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
