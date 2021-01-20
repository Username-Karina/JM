package program;

public class Calculator {
    int number1;
    int number2;
    char op;

    public Calculator(int number1,int number2,char op) {
        this.number1 = number1;
        this.number2 = number2;
        this.op = op;
    }
    public int calculator(){
        int result = 0;
        switch (op){
            case '+':
                result=number1+number2;
                break;
            case '-':
                result=number1-number2;
                break;
            case '*':
                result=number1*number2;
                break;
            case '/':
                result=number1/number2;
                break;
            default:
                System.out.println("Unknown operation");
        }
        return result;
    }

}
