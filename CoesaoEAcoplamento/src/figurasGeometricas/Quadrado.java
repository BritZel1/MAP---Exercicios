package figurasGeometricas;

public class Quadrado implements FiguraGeometricaI{
	
	private double lado;

    public Quadrado(double lado) throws FigureException {
        if (lado <= 0) throw new FigureException();
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) throws FigureException {
    	if (lado <= 0) throw new FigureException();
        this.lado = lado;
    }
    
    @Override
    public String toString() {
        return "O tamanho dos lados do quadrado = " + this.lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

}
