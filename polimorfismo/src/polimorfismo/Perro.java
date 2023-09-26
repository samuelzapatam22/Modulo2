
package polimorfismo;

public class Perro extends Animal {

    String raza;

    public Perro(String criollo, String firu_id_4) {
    }

    public Perro(String raza, String nombre, String genero, int edad) {
        super(nombre, genero, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


}
