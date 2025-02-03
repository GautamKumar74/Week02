package assistedproblems.animalkingdom;
public class AnimalHierarchy{
    public static void main(String[] args){
        Animal a= new Animal();
        a.makeSound();
        Dog d= new Dog();
        d.makeSound();
        Cat c= new Cat();
        c.makeSound();
        Bird b= new Bird();
        b.makeSound();
    }
}