package co.edu.uniquindio.poo.model;

public abstract class Persona {
    String nombre;
    String cedula;
    String telefono;
    String correo;

    public Persona(String cedula, String correo, String nombre, String telefono) {
        this.cedula = cedula;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

  


}
