package Cydeo2.day44_CustomClasses;

public class Offer {

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer(String company, String location){

        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    public String toString(){

        String info = company + " located in " + location;

        info += "\n " + (salary > 0 ? salary : "");

        info += "\n " + (isFullTime ? "Full time" : "Contract");

        info += "\n " + (numberOfPTO > 0 ? numberOfPTO : "");

        return info;

    }
}
