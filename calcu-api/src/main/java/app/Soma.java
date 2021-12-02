package app;

import io.jooby.annotations.GET;
import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Soma {
    
    @Path("/soma/{op1}/{op2}")
    @GET
    public String rotaSoma(@PathParam double op1, @PathParam double op2){

        try {
            
            double soma = op1 + op2;
            
            return Double.toString(soma);
            
        } catch (NumberFormatException NumberEF) {

                throw new BadRequestException(String.format("Parâmetro inválido: %s", op1));
            } 
        
    }

}

