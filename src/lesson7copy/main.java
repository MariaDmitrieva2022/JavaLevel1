package lesson7copy;

import lesson7.Cat;

public class main {
    public static void main(String[] args) {
        lesson7.Cat cat = new lesson7.Cat("Барсик", 20);
        lesson7.Cat cat2 = new lesson7.Cat("Рыжик", 150);
        lesson7.Cat cat3 = new Cat("Леопольд", 50);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        plate.info();
    }
}
