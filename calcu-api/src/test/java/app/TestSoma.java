package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSoma{
    @Test
    public void testSoma(){
        Soma soma = new Soma();
        assertEquals(3, soma.rotaSoma(1,2));
    };
}