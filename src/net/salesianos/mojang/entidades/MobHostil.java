package net.salesianos.mojang.entidades;
import net.salesianos.mojang.interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    protected int fuerza;

    public MobHostil(int salud) {
        super(salud);
    }

    @Override 
    public int atacar() {
        return this.fuerza;
    }

    public void recibirAtaque(int ataque) {
        this.salud = this.salud - ataque;
        System.out.println("El daño recibido ha sido de " + ataque);
        System.out.println("La salud restante es " + this.salud);
    }
}
