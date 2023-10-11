package com.clean.architecture.cursocleanarchitecture.escola;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {
    /**
     * Method under test: {@link Email#Email(String)}
     */
    @Test
    @DisplayName("Testando a exceção lançada pelo construtor quando um email não segue o padrão")
    void testeExceptionContrutor() {

        assertThrows(IllegalArgumentException.class, () -> new Email("Endereco"));
    }
}

