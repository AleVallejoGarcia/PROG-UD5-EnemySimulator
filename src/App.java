import java.util.Scanner;

import net.salesianos.mojang.entidades.Personaje;
import net.salesianos.mojang.entidades.Mobs.Enderman;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        int opcion; 
        int fuerza = 0, defensa = 0;

        System.out.println("Bienvenido usuario");

        System.out.println("Elija su arma");
        System.out.println("Arma: \n 1. Ninguna \n 2. Espada de madera \n 3. Espada de hierro \n 4. Espada de diamante");
        opcion = keyboard.nextInt();
        switch (opcion) {
            case 1:
                fuerza = 1;
                break;
            case 2:
                fuerza = 2;
                break;
            case 3:
                fuerza = 3;
                break;
            case 4:
                fuerza = 5;
                break;
        }
        System.out.println("Elija su armadura");
        System.out.println("Arma: \n 1. Ninguna \n 2. De cuero \n 3. De hierro \n 4. De diamante");
        opcion = keyboard.nextInt();
        switch (opcion) {
            case 1:
                defensa = 0;
                break;
            case 2:
                defensa = 1;
                break;
            case 3:
                defensa = 2;
                break;
            case 4:
                defensa = 3;
                break;
        }
        Personaje Steve = new Personaje(defensa, fuerza);

        Enderman enderito = new Enderman(14);
        
        while (enderito.getSalud() > 0)  {
            Steve.atacar();
        }
    }
}
