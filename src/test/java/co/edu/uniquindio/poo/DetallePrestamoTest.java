package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.DetallePrestamo;
import co.edu.uniquindio.poo.model.Libro;

public class DetallePrestamoTest {
     private DetallePrestamo detallePrestamo;

    @BeforeEach
    public void setUp() {
        Libro libro = new Libro("001", "1234567890", "Autor A", "Editorial A", "Libro A", "2023", 10);
        detallePrestamo = new DetallePrestamo(100.0, 2, libro);
    }

    @Test
    public void testCantidadDeLibrosPrestados() {
        assertEquals(2, detallePrestamo.getCantidad());
    }

    @Test
    public void testModificarSubTotal() {
        assertEquals(100.0, detallePrestamo.getSubTotal());

        detallePrestamo.setSubTotal(150.0);
        assertEquals(150.0, detallePrestamo.getSubTotal());
    }
}