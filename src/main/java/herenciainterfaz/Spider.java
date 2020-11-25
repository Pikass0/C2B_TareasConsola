
package herenciainterfaz;


public class Spider extends Animal{

    public Spider() {
        super(8);
    }

    @Override
    public void walk() {
        System.out.println("Camina araña");
    }

    @Override
    public void eat() {
        System.out.println("Come araña");
    }
    
}
