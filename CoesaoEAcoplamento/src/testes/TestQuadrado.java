package testes;

import static org.junit.jupiter.api.Assertions.*;
import figurasGeometricas.Quadrado;
import figurasGeometricas.FigureException;
import figurasGeometricas.FiguraGeometricaI;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestQuadrado {
	
    static FiguraGeometricaI quadrado;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		try {
			quadrado = new Quadrado(5);
			} catch (FigureException exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }
	}
	
	

	 @Test
	    public void testGetPerimetroQuadrado() {
	        assertEquals(20.00, quadrado.getPerimetro());
	    }
	 
	@Test
	 public void testGetAreaQuadrado() {
        assertEquals(25.00, quadrado.getArea());
    }
	
	//teste do exception
	
	@Test
    public void testGetQuadradoException() {
        assertThrows(FigureException.class, () -> {
            Quadrado quadradoFail = new Quadrado(-2);
            quadradoFail.getArea();
            quadradoFail.getPerimetro();
        });
    }

	

}
