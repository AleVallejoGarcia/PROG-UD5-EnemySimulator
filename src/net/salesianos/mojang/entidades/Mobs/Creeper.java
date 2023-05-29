package net.salesianos.mojang.entidades.Mobs;
import net.salesianos.mojang.entidades.MobHostil;
public class Creeper extends MobHostil {

    public Creeper(int salud) {
        super(salud);
        this.fuerza = 12;
    }

    public int getSalud() { return this.salud; }
    public int getFuerza() { return this.fuerza; }

    @Override
    public void Moverse() {
        System.out.println("Te mira ominosamente mientras se acerca hacia ti");

    }
    
}
