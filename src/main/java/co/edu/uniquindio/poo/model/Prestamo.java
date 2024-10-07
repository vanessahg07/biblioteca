package co.edu.uniquindio.poo.model;

import java.time.LocalDateTime;
import java.util.Collection;

public class Prestamo {
    private LocalDateTime fechaPrestamo;
    private LocalDateTime fechaEntrega;
    private String codigo;
    private double total;
    private boolean estado;
    private Collection<DetallePrestamo> DetallePrestamo;
    
    public Prestamo(LocalDateTime fechaPrestamo, LocalDateTime fechaEntrega, String codigo, double total, boolean estado) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.codigo = codigo;
        this.total = total;
        this.estado = estado;
    }
    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Collection<DetallePrestamo> getDetallePrestamo() {
        return DetallePrestamo;
    }
    public void setDetallePrestamo(Collection<DetallePrestamo> detallePrestamo) {
        DetallePrestamo = detallePrestamo;
    }

}
