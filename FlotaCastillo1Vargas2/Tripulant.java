/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlotaCastillo1Vargas2;

/**
 *
 * @author alejo
 */
public abstract class Tripulant {

    protected String nom;
    protected String cognoms;
    protected String transmissor;   
    protected int ciclesOrbitals;

    public Tripulant(String nom, String cognoms, String transmissor, int ciclesOrbitals) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.transmissor = transmissor;
        this.ciclesOrbitals = ciclesOrbitals;
    }

    public Tripulant(String nom, String cognoms, int ciclesOrbitals) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.ciclesOrbitals = ciclesOrbitals;
        this.transmissor = null;
    }

    @Override
    public String toString() {
        if (transmissor == null) {
            return nom + " " + cognoms + " -> " + ciclesOrbitals + " cicles.";
        } else {
            return nom + " " + cognoms + " [" + transmissor + "] -> " + ciclesOrbitals + " cicles.";
        }
    }

    public abstract void mostrarOficialComplet();
    public abstract void mostrarOficialClassificat();

    public String getNom() { return nom; }
    public String getCognoms() { return cognoms; }
    public String getTransmissor() { return transmissor; }
    public int getCiclesOrbitals() { return ciclesOrbitals; }

    public void setTransmissor(String transmissor) { this.transmissor = transmissor; }
}

