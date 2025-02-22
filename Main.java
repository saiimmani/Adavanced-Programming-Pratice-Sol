abstract class Animal {
    abstract void makeSound();
    abstract void eat();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }

    @Override
    void eat() {
        System.out.println("Bird eats seeds");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();

        bird.makeSound();
        bird.eat();
    }
}
