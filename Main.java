package RunTimePolymorphism.copy;
public class Animal {
    public void makeSound(){
        System.out.println("This is sound method of Animal");
        }
    }
    class Dog extends Animal{
    public void makeSound(){
        System.out.println("This is sound method of Dog");
        }
    }
    class Cat extends Animal{
    public void makeSound(){
        System.out.println("This is sound method of Cat");
        }
    }

public class Main {
    public static void main(String[] args) {
        Animal an = new Dog();
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); 
        cat.makeSound(); 
    }
}
