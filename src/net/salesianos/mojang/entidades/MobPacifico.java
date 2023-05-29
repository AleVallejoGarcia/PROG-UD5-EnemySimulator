package net.salesianos.mojang.entidades;
import net.salesianos.mojang.interfaces.*;

public abstract class MobPacifico extends Mob implements Daño {
    
    public MobPacifico(int salud) {
        super(salud);
    }

    
    @Override
    public void recibirAtaque(int ataque) {
        this.salud = this.salud - ataque;
    }
}
