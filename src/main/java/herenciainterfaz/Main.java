
package herenciainterfaz;


public class Main {
    public static void main(String[] args) {
        
        Animal[] animales = new Animal[3];
        
        animales[0] = new Spider();
        animales[1] = new Cat("Misifú");
        animales[2] = new Fish("Nemo");
                
        for (Animal animal : animales) {
            animal.walk();
        }
        
        
    }
}
