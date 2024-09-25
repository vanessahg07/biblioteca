package co.edu.uniquindio.poo.model;

public class Bibliotecario extends Persona {

    private double salario;

    public Bibliotecario(String cedula, String correo, String nombre, String telefono, double salario) {
        super(cedula, correo, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
