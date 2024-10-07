package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Libro;

public class LibroTest {
    private Libro libro;

    @BeforeEach
    public void setUp() {
        libro = new Libro("001", "1234567890", "Autor A", "Editorial A", "Libro A", "2023", 10);
    }

    @Test
    public void testObtenerTituloYAutor() {
        assertEquals("Libro A", libro.getTitulo());
        assertEquals("Autor A", libro.getAutor());
    }

    @Test
    public void testModificarUnidadesVendidas() {
        libro.setUnidadesVentas(8);
        assertEquals(8, libro.getUnidadesVentas());
    }

}