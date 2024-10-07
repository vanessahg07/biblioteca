package co.edu.uniquindio.poo.model;

public class Libro {
    private String codigo;
    private String isbn;
    private String autor;
    private String editorial;
    private String titulo;
    private String fecha;
    private int unidadesVentas;

    public Libro(String codigo, String isbn, String autor, String editorial, String titulo, String fecha,
            int unidadesVentas) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.titulo = titulo;
        this.fecha = fecha;
        this.unidadesVentas = unidadesVentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesVentas() {
        return unidadesVentas;
    }

    public void setUnidadesVentas(int unidadesVentas) {
        this.unidadesVentas = unidadesVentas;
    }
    
}