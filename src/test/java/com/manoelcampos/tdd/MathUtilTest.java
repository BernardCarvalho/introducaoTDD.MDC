package com.manoelcampos.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe para inclusão dos testes unitários para
 * os métodos mdc() da classe {@link MathUtil},
 * que calcula o Máximo Divisor Comum de dois ou mais números.
 *
 * <p>Cada teste unitário deve verificar uma determinada propriedade
 * do MDC. Os métodos de teste indicam o número da 
 * <a href="https://pt.wikipedia.org/wiki/Máximo_divisor_comum#Propriedades">propriedade<</a> 
 * testada (como p1) no nome.</p>
 * 
 * @author Manoel Campos da Silva Filho <http://github.com/manoelcampos>
 */
class MathUtilTest {
    @Test
    public void testaPropriedade1ComPar(){
        final int a = 6;
        final int b = 2;
        final int esperado = 2;
        assertEquals(esperado, MathUtil.mdc(a, b));
    }
    @Test
    public void testaPropriedade1ComImpar(){
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        assertEquals(esperado, MathUtil.mdc(a, b));
    }
    @Test
    public void testaPropriedade2(){
        final int a = 8;
        final int b = 4;
        final int divisor = 2;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido%divisor == 0);
    }
    

}
