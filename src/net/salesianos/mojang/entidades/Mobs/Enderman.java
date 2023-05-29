package net.salesianos.mojang.entidades.Mobs;
import net.salesianos.mojang.entidades.MobHostil;

public class Enderman extends MobHostil {


    public Enderman(int salud) {
        super(salud);
        this.fuerza = 6;
    }

    public int getSalud() { return this.salud; }
    public int getFuera() { return this.fuerza; }

    @Override
    public void Moverse() {
        System.out.println("Se teletransporta detrás");
    }


    
}
