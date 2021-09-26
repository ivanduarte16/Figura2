public class Cuadrado extends Figura {
    
    //Atributos
    private double costado;
    
    public Cuadrado(int id, String borde, String relleno, Punto origen, int costado) {
        super(id, borde, relleno, origen);
        this.costado = costado;
    }

    @Override
    double area() {
        return this.costado*this.costado;
    }

    @Override
    double perimetro() {
        return this.costado*4;
    }

    @Override
    void escalar(int porcentaje) {
        this.costado = (porcentaje/100)*this.costado;
    }

    @Override
    public String toString() {
        return "Cuadrado "+"con el id "+this.getId()+" y en la posicion "+this.getOrigen();
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
