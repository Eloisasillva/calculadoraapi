package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacaoTeste {
    
    @Test
    public void vericaCasoBase(){
        Multipilcacao multiplicacao = new Multipilcacao();
        double resultado = multiplicacao.calcula("5", "3");
        assertEquals(15.0, resultado);
    }
    @Test
    public void vericaCasoBase2(){
        Multipilcacao multiplicacao = new Multipilcacao();
        double resultado = multiplicacao.calcula("3", "2");
        assertEquals(6.0, resultado);
    }

}
