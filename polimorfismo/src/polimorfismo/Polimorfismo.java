
package polimorfismo;


public class Polimorfismo {

   
    public static void main(String[] args) {
        long id = 0001;
        Perro miPerro = new Perro(" Criollo"," Firu, id, 4");
        Centro listadeAnimales = new  Centro();
        listadeAnimales.agregarAnimales(miPerro);

        Gato miGato = new Gato(" lola", " cat",  2);
        listadeAnimales.agregarAnimales(miGato);
        listadeAnimales.listaAnimal();
    }
    
}
