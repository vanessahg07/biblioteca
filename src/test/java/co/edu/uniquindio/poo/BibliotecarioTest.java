package co.edu.uniquindio.poo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Bibliotecario;

public class BibliotecarioTest {
     private Bibliotecario bibliotecario;

    @BeforeEach
    public void setUp() {
        bibliotecario = new Bibliotecario("Maria", "456", "2222222", "maria@correo.com", 1200.50);
    }

    @Test
    public void testModificarSalario() {
        assertEquals(1200.50, bibliotecario.getSalario());

        bibliotecario.setSalario(1500.00);
        assertEquals(1500.00, bibliotecario.getSalario());
    }

    @Test
    public void testObtenerNombreYCorreo() {
        assertEquals("Maria", bibliotecario.getNombre());
        assertEquals("maria@correo.com", bibliotecario.getCorreo());
    }

}