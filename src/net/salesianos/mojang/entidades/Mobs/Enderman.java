package net.salesianos.mojang.entidades.Mobs;
import net.salesianos.mojang.entidades.MobHostil;

public class Enderman extends MobHostil {


    public Enderman(int salud) {
        super(salud);
        this.fuerza = 6;
    }

    @Override
    public void Moverse() {
        System.out.println("Se teletransporta detrás");
    }


    
}
