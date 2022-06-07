package testes;

import static org.junit.jupiter.api.Assertions.*;

import figurasGeometricas.FigureException;
import figurasGeometricas.FiguraGeometricaI;
import figurasGeometricas.Circulo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCirculo {
	
    static FiguraGeometricaI circulo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		try {
            circulo = new Circulo(3);
        } catch (FigureException exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }
	}

	@Test
	public void testGetAreaCirculo() {
		assertEquals(28.27, circulo.getArea(), 1);
	}
	

	//teste Exception
		@Test
	    public void testGetCirculoException() {
	        assertThrows(FigureException.class, () -> {
	            Circulo circuloFail = new Circulo(-2);
	            circuloFail.getArea();
	            circuloFail.getPerimetro();
	        });
	    }
	
	 
}
