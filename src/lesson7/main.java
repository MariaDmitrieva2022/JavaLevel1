package lesson7;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 20);
        Cat cat2 = new Cat("Рыжик", 150);
        Cat cat3 = new Cat("Леопольд", 50);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        plate.info();
    }
}
