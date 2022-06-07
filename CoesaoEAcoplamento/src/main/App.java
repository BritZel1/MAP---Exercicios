package main;

import figurasGeometricas.*;

public class App {

	public static void main(String[] args) {
		
		//cria��o das figuras
		try {
			
			 FiguraGeometricaI circulo = new Circulo(3);
	         FiguraGeometricaI quadrado = new Quadrado(8);
	         FiguraGeometricaI retangulo = new Retangulo(5, 8);
	         
	         System.out.println("\n======= Area das figuras geometricas criadas =======\n");
	         System.out.printf("�rea do ret�ngulo: %.2f\n", retangulo.getArea());
	         System.out.printf("�rea do c�rculo: %.2f\n", circulo.getArea());
	         System.out.printf("�rea do quadrado: %.2f\n", quadrado.getArea());
	         
	         System.out.println("\n======= Perimetro das figuras geometricas criadas =======\n");
	         System.out.printf("Per�metro do ret�ngulo: %.2f\n", retangulo.getPerimetro());
	         System.out.printf("Per�metro do c�rculo: %.2f\n", circulo.getPerimetro());
	         System.out.printf("Per�metro do quadrado: %.2f\n", quadrado.getPerimetro());
			
	         System.out.println("\n======= Dados das figuras geometricas criadas =======\n");
	         System.out.println(circulo.toString());
	         System.out.println(quadrado.toString());
	         System.out.println(retangulo.toString());
			
		}catch (FigureException exception) {
			exception.printStackTrace();
		}
		
		 
		

	}

}
