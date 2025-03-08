package com.sistema.usuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    @Test
    void testVendedor() {
        Vendedor vendedor = new Vendedor("Maria", "maria@email.com", "1234");
        assertFalse(vendedor.isAdministrador());
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas(); // Verifique a saída no console
    }

}
