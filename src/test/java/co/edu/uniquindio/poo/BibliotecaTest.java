package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Biblioteca;
import co.edu.uniquindio.poo.model.Libro;

public class BibliotecaTest {
     private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        // Inicializa la biblioteca antes de cada prueba
        biblioteca = new Biblioteca("Biblioteca Central");
    }

    @Test
    public void testAgregarLibroYConsultarPorCodigo() {
        // Crea una colección de libros
        Collection<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("001", "1234567890", "Autor A", "Editorial A", "Libro A", "2023", 10);
        libros.add(libro1);

        // Añadir libros a la biblioteca
        biblioteca.setLibros(libros);

        // Consulta por código y verifica que se obtiene el libro correcto
        Libro libroConsultado = biblioteca.consultarLibroPorCodigo("001");
        assertNotNull(libroConsultado); // Verifica que el libro no sea nulo
        assertEquals("001", libroConsultado.getCodigo()); // Verifica que el código sea correcto
    }

}