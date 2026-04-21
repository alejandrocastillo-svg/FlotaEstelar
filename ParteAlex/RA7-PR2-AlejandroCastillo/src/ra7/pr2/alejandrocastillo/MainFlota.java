/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ra7.pr2.alejandrocastillo;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author laura
 */
public class MainFlota {


    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static void main(String[] args) {
        ArrayList<Oficial> llistaOficials = new ArrayList<>();

        llistaOficials.add(new Oficial(1001, "Comandament", 55000.0, "Tiberius", "Drax", "t.drax@flota.gal", 20));
        llistaOficials.add(new Oficial(1002, "Enginyeria", 42000.0, "Elara", "Zane", "e.zane@flota.gal", 16));

        llistaOficials.add(new Oficial(1003, "Navegació", 38000.0, "Jace", "Corin", "j.corin@flota.gal", 12));
        llistaOficials.add(new Oficial(1004, "Navegació", 35000.0, "Kaelen", "Voss", "k.voss@flota.gal", 10));

        llistaOficials.add(new Oficial(1005, "Ciència", 41000.0, "Rael", "Vex", "r.vex@flota.gal", 18));
        llistaOficials.add(new Oficial(1006, "Seguretat", 33000.0, "Kira", "Rey", "k.rey@flota.gal", 11));

        llistaOficials.add(new Oficial(1007, "Ciència", 31000.0, "Lyra", "Nova", "l.nova@flota.gal", 5));
        llistaOficials.add(new Oficial(1008, "Enginyeria", 29000.0, "Sylas", "Tarn", "s.tarn@flota.gal", 8));
        llistaOficials.add(new Oficial(1009, "Medicina", 45000.0, "Anya", "Sol", "a.sol@flota.gal", 7));
        llistaOficials.add(new Oficial(1010, "Comandament", 30000.0, "Jax", "Orion", "j.orion@flota.gal", 2));

        llistaOficials.add(new Oficial(9901, 60000.0, "Xan", "Kryze", 19));
        llistaOficials.add(new Oficial(9902, 45000.0, "Cara", "Dune", 15));
        llistaOficials.add(new Oficial(9903, 40000.0, "Vorin", "Thal", 12));
        llistaOficials.add(new Oficial(9904, 37000.0, "Din", "Djarin", 10));

        llistaOficials.add(new Oficial(9905, 52000.0, "Boba", "Fett", 5));
        llistaOficials.add(new Oficial(9906, 31000.0, "Gideon", "Hask", 3));

        Collections.shuffle(llistaOficials);

    }

}
