package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Estudiante;

public class EstudianteTest {
    private Estudiante estudiante;

    @BeforeEach
    public void setUp() {
        estudiante = new Estudiante("Juan", "123", "1111111", "juan@correo.com");
    }

    @Test
    public void testObtenerNombreYCedula() {
        assertEquals("Juan", estudiante.getNombre());
        assertEquals("123", estudiante.getCedula());
    }

    @Test
    public void testModificarTelefono() {
        estudiante.setTelefono("3333333");
        assertEquals("3333333", estudiante.getTelefono());
    }

}