package dominio;
import java.util.ArrayList;

public abstract class Profesor {



    protected ArrayList<Merito> meritos = new ArrayList<>();
    protected String nombre;

    ///constructor////
    public Profesor(String nombre) {
        this.nombre = nombre;
 
        meritos = new ArrayList<>();
    }

    ////creacion del metodo abstracto
    public abstract double calcularValoracion();


    public Profesor annadirMerito(Merito m) {
    meritos.add(m);
    return this;
    }

}
