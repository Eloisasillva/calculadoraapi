package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdicaoTest {
    
    @Test
    public void verificaCasoBase(){
       Adicao adicao=new Adicao();
       double resultado = adicao.calcula("3","4");
       assertEquals(7.0, resultado);
    }

    @Test
    public void verificaCasoBase2(){
       Adicao adicao=new Adicao();
       double resultado = adicao.calcula("4","4");
       assertEquals(8.0, resultado);
    }
}
