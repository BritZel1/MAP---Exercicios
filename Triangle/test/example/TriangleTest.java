package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 2); 
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    }
    
    @Test 
    public void testIsocelesTriangleHaveTwoEqualSides() throws Exception { 
        Triangle triangle = new Triangle(1, 2, 2); 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    }
    
    @Test 
    public void testScaleneTriangleHaveDiferentSides() throws Exception { 
        Triangle triangle = new Triangle(4, 3, 5); 
        assertEquals(TriangleKind.SCALENE, triangle.getKind()); 
    }
    
    /* Assertion.assertThrows(tipo esperado do exception, o executable (a lambda que faz o exception acontecer), messagem pra mostrar caso dê erro)
     * Na documentação fala que retorna o exceptiom e que se nenhum exception acontecer (ou um tipo diferente aconteça) o método falha.
     * 
     * uma função lambda é uma função sem declaração: não é necessário colocar um nome, um tipo de retorno e o modificador de acesso.
     */
    @Test
    public void testExceptionAllSidesTriangleEqualsToZero() {
        Assertions.assertThrows(TriangleException.class, () -> {
                    new Triangle(0, 0, 0);
                }, "all triangle sides = 0 should throw"
        );
    }
    
    //se tem lados negativos
    
    @Test
    public void testExceptionhasImpossibleSides() {
        Assertions.assertThrows(TriangleException.class, () -> {
                    new Triangle(-1, -2, 3);
                }, "any triangle sides < 0 should throw"
        );
    }
    
    //se a soma de 2 lados é menor ou igual que o 1.
    @Test
    public void testExceptionViolatesTriangleInequality() {
        Assertions.assertThrows(TriangleException.class, () -> {
                    new Triangle(3, 1, 2);
                }, "if the sum of 2 triangle sides <= the other should throw"
        );
    }
    
}