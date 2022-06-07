package figurasGeometricas;


public class FigureException extends Exception{ //Exception em caso dos valores das figura serem menores ou iguais a zero
	
	public FigureException() {
		 super("O valor deve ser maior que zero");
	}
}
