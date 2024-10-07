package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Prestamo;

public class PrestamoTest {
     private Prestamo prestamo;

    @BeforeEach
    public void setUp() {
        prestamo = new Prestamo(LocalDateTime.now(), LocalDateTime.now().plusDays(5), "P001", 150.0, true);
    }

    @Test
    public void testObtenerCodigoYTotal() {
        assertEquals("P001", prestamo.getCodigo());
        assertEquals(150.0, prestamo.getTotal());
    }

    @Test
    public void testModificarFechaDeEntrega() {
        LocalDateTime nuevaFecha = LocalDateTime.now().plusDays(7);
        prestamo.setFechaEntrega(nuevaFecha);
        assertEquals(nuevaFecha, prestamo.getFechaEntrega());
    }
}
