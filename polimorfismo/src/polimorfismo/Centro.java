
package polimorfismo;

import java.util.ArrayList;
import java.util.List;


public class Centro {

    private final List<Animal> animalesDisponibles;

    public Centro() {
        animalesDisponibles = new ArrayList<>();
    }
    public void agregarAnimales (Animal animal){
        animalesDisponibles.add(animal);
    }
    public void listaAnimal(){
        System.out.println("Animales Disponibles");
        for(Animal animal : animalesDisponibles){
            System.out.println("Nombre " + animal.getNombre()+"Edad "+ animal.getEdad());
            switch (animal) {
                case Perro perro -> System.out.println("La raza es: "+ perro.getRaza());
                case Gato gato -> System.out.println("El genero es"+ gato.getGenero());
                default -> {
                }
            }
        }
    }
}
﻿
