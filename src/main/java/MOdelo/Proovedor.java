/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOdelo;

/**
 *
 * @author alexb
 */
public class Proovedor {
    
    public String nombre;
    public String ID;
    public String Pais;
    public String telefono;

    public Proovedor(String nombre, String ID, String Pais, String telefono) {
        this.nombre = nombre;
        this.ID = ID;
        this.Pais = Pais;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proovedor{" + "nombre=" + nombre + ", ID=" + ID + ", Pais=" + Pais + ", telefono=" + telefono + '}';
    }
    
    
}
