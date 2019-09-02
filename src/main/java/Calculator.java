public class Calculator {

    private double first_number;
    private double second_number;

    public Calculator(double first_number, double second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
    }

    public double getFirstNumber(){
        return this.first_number;
    }

    public double getSecondNumber(){
        return this.second_number;
    }

    public double addNumbers(){
        return first_number + second_number;
    }

    public double subtractNumbers(){
        return first_number - second_number;
    }

    public double multiplyNumbers(){
        return first_number * second_number;
    }

}

