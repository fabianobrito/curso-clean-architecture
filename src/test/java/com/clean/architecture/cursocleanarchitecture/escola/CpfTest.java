package com.clean.architecture.cursocleanarchitecture.escola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CpfTest {
    /**
     * Method under test: {@link Cpf#Cpf(String)}
     */
    @Test
    @DisplayName("Testando a exceção lançada pelo construtor quando um cpf não segue o padrão")
    void testExceptionCpfConstructor() {
        assertEquals("Numero", (new Cpf("Numero")).numero);
        assertThrows(IllegalArgumentException.class, () -> new Cpf("999.999.999-99"));
    }
}

