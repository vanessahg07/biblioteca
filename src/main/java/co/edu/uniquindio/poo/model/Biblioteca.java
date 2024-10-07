package co.edu.uniquindio.poo.model;

import java.util.Collection;

public class Biblioteca {
    private String nombre;
    private Collection<Libro> libros;
    private Collection<Persona> personas;
    private Collection<Estudiante> estudiantes;
    private Collection<Prestamo> prestamos;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Collection<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Collection<Persona> personas) {
        this.personas = personas;
    }

    public Integer consultarPrestamosPorNombreLibro(String nombreLibro) {
        return (int) prestamos.stream()
                              .filter(prestamo -> prestamo.getDetallePrestamo().stream()
                                               .anyMatch(detalle -> ((Libro) detalle.getLibros()).getTitulo().equals(nombreLibro)))
                              .count();
    }
//metodo para consultar un libro
    public Libro consultarLibroPorCodigo(String codigo) {
        return libros.stream()
                     .filter(libro -> libro.getCodigo().equals(codigo))
                     .findFirst()
                     .orElse(null);
    }




}