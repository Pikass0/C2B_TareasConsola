
package herenciainterfaz;


public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }
    
    public Cat() {
        super(8);
    }

    @Override
    public void walk() {
        System.out.println("Camina gato");
    }

    @Override
    public void eat() {
        System.out.println("Come gato");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Juega gato");
    }
    
    
    
}
