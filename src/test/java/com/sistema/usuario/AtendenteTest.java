package com.sistema.usuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtendenteTest {

    @Test
    void testAtendente() {
        Atendente atendente = new Atendente("Carlos", "carlos@email.com", "1234");
        assertFalse(atendente.isAdministrador());
        atendente.receberPagamento(100.0);
        atendente.receberPagamento(50.0);
        atendente.fecharCaixa(); // Verifique a saída no console
    }

}
