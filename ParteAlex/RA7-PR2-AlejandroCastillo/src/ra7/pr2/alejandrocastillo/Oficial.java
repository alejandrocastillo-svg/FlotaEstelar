/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.pr2.alejandrocastillo;

/**
 *
 * @author a.castillo
 */
public class Oficial extends Tripulante {

    private int codigoIdentificacion;
    private String division;
    private double creditosGalacticos;

    public Oficial(int codigoIdentificacion, String division, int creditosGalacticos, String nombre, String apellido, String transmisor, int ciclosOrbitales) {
        super(nombre, apellido, transmisor, ciclosOrbitales);
        this.codigoIdentificacion = codigoIdentificacion;
        this.division = division;
        this.creditosGalacticos = creditosGalacticos;

    }

    @Override
    public void mostrarOficialCompleto() {
        System.out.println(super.toString() + "\n"
                + codigoIdentificacion + " / " + (division != null ? division.toUpperCase() : "")
                + " / Créditos " + creditosGalacticos + " ¢");
    }
    @Override
    public void mostrarOficialClasificado() {
        // Aqui va alumno2
    }

    public int getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(int codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public double getCreditosGalacticos() {
        return creditosGalacticos;
    }

    public void setCreditosGalacticos(double creditosGalacticos) {
        this.creditosGalacticos = creditosGalacticos;
    }
}
