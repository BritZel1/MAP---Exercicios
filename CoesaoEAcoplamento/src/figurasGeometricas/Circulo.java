package figurasGeometricas;

public class Circulo implements FiguraGeometricaI{
	
	private double raio;
	
	public Circulo(double raio) throws FigureException {
        if (raio <= 0) throw new FigureException();
        this.raio = raio;
    }
	
	//getters e setters
	
	public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) throws FigureException {
    	if (raio <= 0) throw new FigureException();
        this.raio = raio;
    }
    
    @Override
    public String toString() { //para imprimir formatado
        return "Tamanho do raio do circulo: " + this.raio;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.raio;
    }

}
