/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.pr2.alejandrocastillo;

/**
 *
 * @author a.castillo
 */
public class Funciones {

    public static boolean plusPorMision(Oficial o, double plusCredito) {
        if (o.getCiclosOrbitales() >= 10) {
            double plus = plusCredito;
            if (o.getDivision() != null && o.getDivision().equalsIgnoreCase("Navegacion")) {
                plus = plus * 1.5;
            }
            o.setCreditosGalacticos(o.getCreditosGalacticos() + plus);
            return true;
        }
        return false;
    }
}
