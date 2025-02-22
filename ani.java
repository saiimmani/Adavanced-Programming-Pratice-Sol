class Animal {
    String name;
    String sound;
    int num_legs;

    Animal(String name, String sound, int num_legs) {
        this.name = name;
        this.sound = sound;
        this.num_legs = num_legs;
    }

    void make_sound() {
        System.out.println(name + " makes a sound: " + sound);
    }

    void walk() {
        System.out.println(name + " walks on " + num_legs + " legs.");
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog", "barks", 4);
    }

    @Override
    void make_sound() {
        System.out.println(name + " barks loudly!");
    }

    @Override
    void walk() {
        System.out.println(name + " walks energetically on " + num_legs + " legs.");
    }
}

class Cat extends Animal {
    Cat() {
        super("Cat", "meows", 4);
    }

    @Override
    void make_sound() {
        System.out.println(name + " meows softly.");
    }

    @Override
    void walk() {
        System.out.println(name + " walks gracefully on " + num_legs + " legs.");
    }
}

class Bird extends Animal {
    Bird() {
        super("Bird", "chirps", 2);
    }

    @Override
    void make_sound() {
        System.out.println(name + " chirps melodiously.");
    }

    @Override
    void walk() {
        System.out.println(name + " hops on " + num_legs + " legs.");
    }

    void fly() {
        System.out.println(name + " flies in the sky.");
    }
}

public class ani {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.make_sound();
        dog.walk();

        cat.make_sound();
        cat.walk();

        bird.make_sound();
        bird.walk();
        ((Bird) bird).fly();  // Casting to call Bird-specific method
    }
}

