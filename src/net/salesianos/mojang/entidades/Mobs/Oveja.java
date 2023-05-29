package net.salesianos.mojang.entidades.Mobs;
import net.salesianos.mojang.entidades.MobPacifico;
public class Oveja extends MobPacifico {

    private int fuerza = 0;
    public Oveja(int salud) {
        super(salud);
    }
    public int getFuerza() { return this.fuerza; }

    @Override
    public void Moverse() {
        System.out.println("Se mueve por el campo");
    }
    
}
