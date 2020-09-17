package animal;

import animal.Animal;
import edible.Edible;
public class Chicken extends Animal implements Edible {

    @Override
    public String howEat() {
        return "an apple";
    }

    String makeSound() {
        return "chip chip";
    }
}
