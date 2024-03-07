
class RunnerAnimal extends Animal {

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }
}


class FlyingSwimmingAnimal extends Animal {

    @Override
    public void toGo() {
    }
}


class FlyingAnimal extends Animal {

    @Override
    public void toGo() {
    }

    @Override
    public void swim() {
    }
}


class SwimmingAnimal extends Animal {

    @Override
    public void toGo() {
    }

    @Override
    public void fly() {
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cat = new RunnerAnimal();
        Animal bird = new FlyingSwimmingAnimal();
        Animal eagle = new FlyingAnimal();
        Animal fish = new SwimmingAnimal();


        System.out.println("---------------------------");
        cat.toGo();   // +
        cat.fly();    // -
        cat.swim();   // -
        System.out.println("---------------------------");
        bird.toGo();  // -
        bird.fly();   // +
        bird.swim();  // +
        System.out.println("---------------------------");
        eagle.toGo(); // -
        eagle.fly();  // +
        eagle.swim(); // -
        System.out.println("---------------------------");
        fish.toGo();  // -
        fish.fly();   // -
        fish.swim();  // +
        System.out.println("---------------------------");
    }
}
