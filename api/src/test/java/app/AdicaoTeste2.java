package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdicaoTeste2 {

    @Test
    public void testandoBase1(){
        Adicao adicao = new Adicao();
        double resultado = adicao.calcula("2","2");
        assertEquals(4.0, resultado);
    }

    @Test
    public void testandoBase2(){
        Adicao adicao = new Adicao();
        double resultado = adicao.calcula("1","4");
        assertEquals(5.0, resultado);
    } 
    
}
