package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/div/{a}/{b}")
public class Divisao {
    
    @GET
    public double calcula(@PathParam("a") String aStr,@PathParam("b") String bStr ) {
        try {
            double a = Double.parseDouble(aStr);
            double b = Double.parseDouble(bStr);

            if (a < 0) {
                throw new BadRequestException("A calculadora só opera nos reais. Não funciona com números imaginários.");    
            }
            if (b < 0) {
                throw new BadRequestException("A calculadora só opera nos reais. Não funciona com números imaginários.");    
            }
            return (a/b);
            
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}
