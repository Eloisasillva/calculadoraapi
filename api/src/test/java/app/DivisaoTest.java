package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisaoTest {

    Divisao divisao;

    @Test
    public void verificarCasoBase(){
        divisao = new Divisao();
        double resultado = divisao.calcula("4","2");
        assertEquals(2.0, resultado);
    }

    @Test
    public void verificarCasoBase2(){
        divisao = new Divisao();
        double resultado = divisao.calcula("7", "2");
        assertEquals(3.5, resultado);
    }
}