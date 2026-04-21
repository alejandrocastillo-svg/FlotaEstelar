/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.pr2.alejandrocastillo;

/**
 *
 * @author a.castillo
 */
public abstract class Tripulante {
    protected String nombre;
    protected String apellido;
    protected String transmisor;
    protected int ciclosOrbitales;

    public Tripulante(String nombre, String apellido, String transmisor, int ciclosOrbitales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.transmisor = transmisor;
        this.ciclosOrbitales = ciclosOrbitales;
    }
    
    public abstract void mostrarOficialCompleto();
    
    public abstract void mostrarOficialClasificado();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTransmisor() {
        return transmisor;
    }

    public void setTransmisor(String transmisor) {
        this.transmisor = transmisor;
    }

    public int getCiclosOrbitales() {
        return ciclosOrbitales;
    }

    public void setCiclosOrbitales(int ciclosOrbitales) {
        this.ciclosOrbitales = ciclosOrbitales;
    }

   @Override
    public String toString() {
        if (transmisor != null) {
            return nombre + " " + apellido + " [" + transmisor + "] -> " + ciclosOrbitales + " cicles.";
        } else {
            return nombre + " " + apellido + " -> " + ciclosOrbitales + " cicles.";
        }
    }
}
