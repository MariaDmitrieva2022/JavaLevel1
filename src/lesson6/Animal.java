package lesson6;

public class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public void run(int distanceRun) {
        if (this.maxRunDistance > distanceRun) {
            System.out.println(name + " смог пробежать " + distanceRun + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distanceRun + " метров и упал.");
        }
    }

    public void swim(int distanceSwim) {
        if (this.maxSwimDistance > distanceSwim) {
            System.out.println(name + " смог проплыть " + distanceSwim + " метров.");
        } else {
            System.out.println(name + " не смог проплыть " + distanceSwim + " метров и утонул.");
        }
    }
}