package priorityQueue;

import java.util.HashSet;

class Car implements Comparable<Car>{
    private int speed;
    private int power;
    public Car(int speed, int power){
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "[S=" + this.speed + ", P=" + this.power + "]";
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.speed, o.speed);
    }
}