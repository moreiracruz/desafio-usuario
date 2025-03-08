package com.sistema.usuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void testGerente() {
        Gerente gerente = new Gerente("João", "joao@email.com", "1234");
        assertTrue(gerente.isAdministrador());
        gerente.alterarSenha("4321");
        assertEquals("4321", gerente.getSenha());
    }

}
