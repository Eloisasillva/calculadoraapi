package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class subtracaoTeste {
    
    @Test
        public void testandoBase(){
            Subtracao subtracao = new Subtracao();
            double resultado = subtracao.calcula("10","3");
            assertEquals(7.0, resultado);
        }

        @Test
        public void testandoBase2(){
            Subtracao subtracao = new Subtracao();
            double resultado = subtracao.calcula("11","4");
            assertEquals(7.0, resultado);
        }

         @Test
        public void testandoBase3(){
            Subtracao subtracao = new Subtracao();
            double resultado = subtracao.calcula("12","5");
            assertEquals(7.0, resultado);
        }


}
