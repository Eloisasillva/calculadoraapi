package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacaoTeste {
    
    @Test
        public void testandoBase(){
            Multipilcacao multiplicacao = new Multipilcacao();
            double resultado = multiplicacao.calcula("5","3");
            assertEquals(15.0, resultado);
        }

        @Test
        public void testandoBase2(){
            Multipilcacao multiplicacao = new Multipilcacao();
            double resultado = multiplicacao.calcula("3","2");
            assertEquals(6.0, resultado);
        }

         @Test
        public void testandoBase3(){
           Multipilcacao multipilcacao = new Multipilcacao();
            double resultado = multipilcacao.calcula("10","3");
            assertEquals(30.0, resultado);
        }

}
