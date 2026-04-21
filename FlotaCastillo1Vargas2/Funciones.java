/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlotaCastillo1Vargas2;

import java.util.ArrayList;

/**
 *
 * @author alejo
 */
public class Funciones {

    // Alumno 1
    public static boolean plusPerMissio(Oficial o, double plusCredit) {
        if (o.getCiclesOrbitals() >= 10) {
            double plus = plusCredit;

            if (o.getDivisio() != null && o.getDivisio().equalsIgnoreCase("Navegació")) {
                plus *= 1.5;
            }

            o.setCreditsGalactics(o.getCreditsGalactics() + plus);
            return true;
        }
        return false;
    }

    // Alumno 2
    public static boolean plusPerMissio(Oficial o, double botiExploracio, double taxaReparacio) {
        if (o.getDivisio() == null) return false;

        if (o.getCiclesOrbitals() >= 15 &&
                (o.getDivisio().equalsIgnoreCase("Comandament")
                        || o.getDivisio().equalsIgnoreCase("Enginyeria"))) {

            o.setCreditsGalactics(o.getCreditsGalactics() + botiExploracio - taxaReparacio);
            return true;
        }
        return false;
    }

    // Mostrar lista
    public static void mostrarDadesTripulacio(ArrayList<Oficial> llista) {
        for (Oficial o : llista) {
            if (o.getDivisio() == null) {
                o.mostrarOficialClassificat();
            } else {
                o.mostrarOficialComplet();
            }
            System.out.println();
        }
    }
}
