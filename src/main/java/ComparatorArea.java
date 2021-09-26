import java.util.Comparator;

class ComparadorPerimetro implements Comparator<Figura>{
    @Override
    public int compare(Figura figura, Figura t1) {
        return (int) (figura.perimetro()- t1.perimetro());
    }
}

class ComparadorPosicion implements Comparator<Figura>{
    @Override
    public int compare(Figura figura, Figura t1) {
        return 0;
    }
}
