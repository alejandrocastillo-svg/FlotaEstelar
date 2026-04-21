/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlotaCastillo1Vargas2;

/**
 *
 * @author alejo
 */
public class Oficial extends Tripulant {

    private int codiIdentificacio;
    private String divisio;  
    private double creditsGalactics;

    public Oficial(int codiIdentificacio, String divisio, double creditsGalactics,
                   String nom, String cognoms, String transmissor, int ciclesOrbitals) {

        super(nom, cognoms, transmissor, ciclesOrbitals);
        this.codiIdentificacio = codiIdentificacio;
        this.divisio = divisio;
        this.creditsGalactics = creditsGalactics;
    }

    public Oficial(int codiIdentificacio, double creditsGalactics,
                   String nom, String cognoms, int ciclesOrbitals) {

        super(nom, cognoms, ciclesOrbitals);
        this.codiIdentificacio = codiIdentificacio;
        this.creditsGalactics = creditsGalactics;
        this.divisio = null;
    }

    @Override
    public void mostrarOficialComplet() {
        if (divisio == null) return;

        System.out.println(super.toString());
        System.out.println(codiIdentificacio + " / " + divisio.toUpperCase() +
                " / Crèdits " + creditsGalactics + " ¢");
    }

    @Override
    public void mostrarOficialClassificat() {
        System.out.println(super.toString());
        System.out.println(codiIdentificacio + " / [DIVISIÓ CLASSIFICADA] / Crèdits "
                + creditsGalactics + " ¢");
    }

    public String getDivisio() { return divisio; }
    public int getCodiIdentificacio() { return codiIdentificacio; }
    public double getCreditsGalactics() { return creditsGalactics; }

    public void setCreditsGalactics(double creditsGalactics) {
        this.creditsGalactics = creditsGalactics;
    }
}

