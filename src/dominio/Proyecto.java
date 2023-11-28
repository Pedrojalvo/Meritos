package dominio;

public class Proyecto extends Merito {
    
    //////atributos///
    protected double financiacion;


    public Proyecto(String titulo, double financiacion) {
        super(titulo);
        this.financiacion = financiacion;
    }
    public double valorar() {
        return financiacion/100000; 
    }

    public double getFinanciacion() {
        return financiacion;
    }

    public void setFinanciacion(double financiacion) {
        this.financiacion = financiacion;
    }


}