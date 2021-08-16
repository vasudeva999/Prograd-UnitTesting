public class Arithmetic {

    int number1, number2;
    Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    int addition(){
        return number1+number2;
    }

    int subtraction(){
        return number1-number2;
    }

    int multiplication(){
        return number1*number2;
    }

    int division(){
        return number1/number2;
    }
}
