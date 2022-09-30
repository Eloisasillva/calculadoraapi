package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdicaoTeste {

    @Test
    public void testandoBase1(){
        Subtracao subtracao = new Subtracao();
        double resultado = subtracao.calcula("1","2");
        assertEquals(3.0, resultado);
    }

    @Test
    public void testandoBase2(){
        Subtracao subtracao = new Subtracao();
        double resultado = subtracao.calcula("11","4");
        assertEquals(15.0, resultado);
    } 
    
}
