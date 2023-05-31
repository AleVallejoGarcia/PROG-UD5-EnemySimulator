# Clases

## Clase Abstracta Mob

- `Atributos`: 
 >Salud: Indica la salud del mob.

- `Constructores`:
 >Tiene un único constructor que pide como parámetro la salud del mob.

- `Métodos`:
>Moverse: en esta clase no hace nada.

La clase mob contiene el atributo salud, el metodo moverse y un contructor que heredará a las clases MobHostil y MobPacifico.

## Clase Abstracta MobHostil

- `Atributos`: 
 >Salud: Indica la salud del mob.
 Fuerza: Indica la fuerza del mob.

- `Constructores`:
 >Tiene un único constructor que pide como parámetro la salud del mob.

- `Métodos`:
 >Moverse: en esta clase no hace nada. 

 > Atacar: devuelve la fuerza del Mob, 

> RecibirAtaque: Recibe como parámetro la fuerza del enemigo y se le resta a la salud actual del mob.

La clase mobHostil hereda de Mob e implementa la interfaz Combate contiene los atributos salud y fuerza, los métodos moverse, atacar y recibirAtaque. Además tiene y un contructor que hereda de Mob y pide como único parámetro la salud.

## Clase Abstracta MobPacifico

- `Atributos`: 
 >Salud: Indica la salud del mob.

- `Constructores`:
 >Tiene un único constructor que pide como parámetro la salud del mob.

- `Métodos`:
 >Moverse: en esta clase no hace nada. 

 > Atacar: devuelve la fuerza del Mob, 

> RecibirAtaque: Recibe como parámetro la fuerza del enemigo y se le resta a la salud actual del mob.

La clase mobPacifico hereda de Mob e implementa la interfaz Combate contiene el atributos salud, el método recibirAtaque. Además tiene y un contructor que hereda de Mob y pide como único parámetro la salud.

## Clase Personaje

- `Atributos`: 
 >Salud: Indica la salud del personaje.

 >Fuerza: Indica la fuerza del personaje.

 >Defensa: Indica la defensa del personaje.

- `Constructores`:
 >Tiene un único constructor que pide como parámetro la defensa y fuerza del personaje e inicializa la salud a 12.

- `Métodos`:
 >Varios métodos de acceso. 

 > Atacar: devuelve la fuerza del Personaje, 

> RecibirAtaque: Recibe como parámetro la fuerza del enemigo a esta cantidad se le resta la defensa del usuario y se le resta a la salud actual del personaje.

La clase Personaje implementa la interfaz Combate contiene los atributos salud, defensa y fuerza, los métodos atacar y recibirAtaque. Además tiene y un contructor que pide como parámetros la fuerza y denfensa e inicializa la salud.

## Clase Enderman

- `Atributos`: 
 >Salud: Indica la salud del mob.
 Fuerza: Indica la fuerza del mob.

- `Constructores`:
 >Tiene un único constructor que pide como parámetro la salud del mob e inicializa su fuerza.

- `Métodos`:
 >Moverse: en esta clase muestra un mensaje por pantalla. 

 > Métodos de acceso y métodos heredados de MobHostil.

La clase Enderman hereda de MobHostil contiene los atributos salud y fuerza, el método moverse. Además tiene y un contructor que hereda de MobHostil y pide como único parámetro la salud e inicializa la fuerza.

## Clase Creeper

- `Atributos`: 
 >Salud: Indica la salud del mob.
 Fuerza: Indica la fuerza del mob.

- `Constructores`:
 >Tiene un único constructor que pide como parámetro la salud del mob e inicializa su fuerza.

- `Métodos`:
 >Moverse: en esta clase muestra un mensaje por pantalla. 

 > Métodos de acceso y métodos heredados de MobHostil.

La clase Creeper hereda de MobHostil contiene los atributos salud y fuerza, el método moverse. Además tiene y un contructor que hereda de MobHostil y pide como único parámetro la salud e inicializa la fuerza.

## Clase Oveja

- `Atributos`: 
 >Salud: Indica la salud del mob.

 >Fuerza: Tiene una fuerza de cero no puede herir al usuario.

- `Constructores`:
 >Tiene un único constructor que pide como parámetro la salud del mob.

- `Métodos`:
 >Moverse: en esta clase muestra un mensaje por pantalla. 

 > Métodos de acceso y métodos heredados de MobPacifico.

La clase Oveja hereda de MobPacifico contiene los atributos salud y fuerza, el método moverse. Además tiene y un contructor que hereda de MobPacifico y pide como único parámetro la salud.

## Interfaz Combate

- `Métodos abstractos`:
 >Atacar: 

La interfaz Combate hereda la interfaz daño y contiene el método abstracto Atacar.

## Interfaz Daño

- `Métodos abstractos`:
 >Recibir Ataque: recibe como parámetro el ataque. 

La interfaz Daño tiene el método abstracto recibirAtaque.

## App

Esta es la clase ejecutable del proyecto lo principal que tiene esta clase es un switch que hace de menú de interacción con el usuario.

### Readme
Para volver al README pinche [aquí](../README.md)