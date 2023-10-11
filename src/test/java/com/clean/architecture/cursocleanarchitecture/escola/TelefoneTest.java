package com.clean.architecture.cursocleanarchitecture.escola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TelefoneTest {
    /**
     * Method under test: {@link Telefone#Telefone(String, String)}
     */
    @Test
    void testConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("Ddd", "Numero"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("99", "Numero"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("42", "Numero"));

    }

    /**
     * Method under test: {@link Telefone#Telefone(String, String)}
     */
    @Test
    void testConstructor2() {
        Telefone actualTelefone = new Telefone("99", "99999999");

        assertEquals("99", actualTelefone.getDdd());
        assertEquals("99999999", actualTelefone.getNumero());
    }
}

