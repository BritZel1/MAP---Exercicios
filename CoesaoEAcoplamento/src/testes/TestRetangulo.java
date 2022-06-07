package testes;

import static org.junit.jupiter.api.Assertions.*;
import figurasGeometricas.Retangulo;
import figurasGeometricas.FigureException;
import figurasGeometricas.FiguraGeometricaI;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestRetangulo {
	
	static FiguraGeometricaI retangulo;

	@BeforeAll
	static void setUpBeforeClass() throws FigureException {
		try {
            retangulo = new Retangulo(3, 4);
        } catch (FigureException exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }
	}
	
	 @Test
	    public void testGetAreaRetangulo() {
	        assertEquals(12.00, retangulo.getArea());
	    }
	 
	  @Test
	    public void testGetPerimetroRetangulo() {
	        assertEquals(14.00, retangulo.getPerimetro());
	    }
	  
	  //exception teste
	  
	  @Test
	    public void testGetRetanguloException() {
	        assertThrows(FigureException.class, () -> {
	            Retangulo retanguloFail = new Retangulo(-2,0);
	            retanguloFail.getArea();
	            retanguloFail.getPerimetro();
	        });
	    }

}
