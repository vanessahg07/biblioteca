package co.edu.uniquindio.poo.model;

public class DetallePrestamo {
    private double subTotal;
    private byte cantidad;

    public DetallePrestamo(double subTotal, byte cantidad) {
        this.subTotal = subTotal;
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }
}
