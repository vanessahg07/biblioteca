package co.edu.uniquindio.poo.model;

public class DetallePrestamo {
    private double subTotal;
    private int cantidad;
    private Libro libros;
    

    public DetallePrestamo(double subTotal, int cantidad, Libro libros) {
        this.subTotal = subTotal;
        this.cantidad = cantidad;
        this.libros = libros;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public DetallePrestamo() {
    }

    public Libro getLibros() {
        return libros;
    }

    public void setLibros(Libro libros) {
        this.libros = libros;
    }

    

}