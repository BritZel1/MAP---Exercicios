package figurasGeometricas;

public class Retangulo implements FiguraGeometricaI{
	
	  private double base;
	  private double altura;
	  
	  public Retangulo(double altura, double base) throws FigureException {
	        if (altura <= 0 || base <= 0) throw new FigureException();
	        this.base = base;
	        this.altura = altura;
	    }
	  
	  //setters e getters
	  
	  public double getAltura() {
	        return this.altura;
	    }

	    public void setAltura(double altura) throws FigureException{
	    	if(altura <=0) throw new FigureException();
	        this.altura = altura;
	    }

	    public double getBase() {
	        return this.base;
	    }

	    public void setBase(double base) throws FigureException{
	    	if(base <=0) throw new FigureException();
	        this.base = base;
	    }
	    
	    @Override
	    public String toString() { //formatação dos dados
	        return "O retângulo criado tem altura de tamanho: " + this.altura + " e largura de tamanho: " + this.base;
	    }

	    @Override
	    public double getArea() {
	        return base * altura;
	    }

	    @Override
	    public double getPerimetro() {
	        return 2 * base + 2 * altura;
	    }
}
