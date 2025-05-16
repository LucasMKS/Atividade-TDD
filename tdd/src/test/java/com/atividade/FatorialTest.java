package com.atividade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FatorialTest {

    @Test
    public void testFatorialDeZero() {
        assertEquals(1, Fatorial.calcularFatorial(0));
    }

    @Test
    public void testFatorialDeUm() {
        assertEquals(1, Fatorial.calcularFatorial(-1));
    }

    @Test
    public void testFatorialDeCinco() {
        assertEquals(120, Fatorial.calcularFatorial(5));
    }

    @Test
    public void testFatorialDeDez() {
        assertEquals(3628800, Fatorial.calcularFatorial(10));
    }

    @Test
    public void testFatorialDeNumeroGrande() {
        // 20! = 2432902008176640000
        assertEquals(2432902008176640000L, Fatorial.calcularFatorial(20));
    }

    @Test
    public void testFatorialNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fatorial.calcularFatorial(-3);
        });
        assertEquals("Número deve ser não negativo.", exception.getMessage());
    }
}
