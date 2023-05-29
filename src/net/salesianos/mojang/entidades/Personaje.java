package net.salesianos.mojang.entidades;

import net.salesianos.mojang.interfaces.Combate;


public class Personaje implements Combate{
    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje(int defensa, int fuerza) {
        this.defensa = defensa;
        this.fuerza = fuerza;
        this.salud = 12;
    }

    public void setDefensa(int defensa) { this.defensa = defensa; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }

    @Override
    public int atacar() {
        return this.fuerza;
    }

    public void recibirAtaque(int ataque) {
        int danyoRecibido = ataque - this.defensa;
        this.salud = this.salud - danyoRecibido;
        System.out.println("El daño recibido ha sido de" + danyoRecibido);
        System.out.println("La salud restante es " + this.salud);
    }
}
