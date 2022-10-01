package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdicaoTeste {

    @Test
    public void testandoBase1(){
        Adicao adicao = new Adicao();
        double resultado = adicao.calcula("1","2");
        assertEquals(3.0, resultado);
    }

    @Test
    public void testandoBase2(){
        Adicao adicao = new Adicao();
        double resultado = adicao.calcula("11","4");
        assertEquals(15.0, resultado);
    } 
    
}
