package Cydeo2.day50_Super;

public class Computer {

    String os;
    int memory;

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
