package lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(food - n < 0) {
            System.out.println("Коту не хватило еды. Он голоден.");
            return false;
        } else {
            System.out.println("Коту хватило еды. Он сыт.");
            food -= n;
        }
        return true;
    }
    public void info() {
        System.out.println("Plate: " + food);
    }
    public void increaseFood() {
       food++;
    }
}
