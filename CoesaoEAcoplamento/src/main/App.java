package main;

import figurasGeometricas.*;

public class App {

	public static void main(String[] args) {
		
		//criação das figuras
		try {
			
			 FiguraGeometricaI circulo = new Circulo(3);
	         FiguraGeometricaI quadrado = new Quadrado(8);
	         FiguraGeometricaI retangulo = new Retangulo(5, 8);
	         
	         System.out.println("\n======= Area das figuras geometricas criadas =======\n");
	         System.out.printf("Área do retângulo: %.2f\n", retangulo.getArea());
	         System.out.printf("Área do círculo: %.2f\n", circulo.getArea());
	         System.out.printf("Área do quadrado: %.2f\n", quadrado.getArea());
	         
	         System.out.println("\n======= Perimetro das figuras geometricas criadas =======\n");
	         System.out.printf("Perímetro do retângulo: %.2f\n", retangulo.getPerimetro());
	         System.out.printf("Perímetro do círculo: %.2f\n", circulo.getPerimetro());
	         System.out.printf("Perímetro do quadrado: %.2f\n", quadrado.getPerimetro());
			
	         System.out.println("\n======= Dados das figuras geometricas criadas =======\n");
	         System.out.println(circulo.toString());
	         System.out.println(quadrado.toString());
	         System.out.println(retangulo.toString());
			
		}catch (FigureException exception) {
			exception.printStackTrace();
		}
		
		 
		

	}

}
