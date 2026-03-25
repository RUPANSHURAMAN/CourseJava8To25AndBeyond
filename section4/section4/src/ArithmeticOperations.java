public class ArithmeticOperations {

    public double  piValue = 3.14;
    static final double PI_VALUE = 3.14;

    static void main(String[] args) {
        ArithmeticOperations  arithmeticOperations = new ArithmeticOperations();
        int result = arithmeticOperations.sum(20,5);
        System.out.println(result);
        System.out.println(PI_VALUE);
        System.out.println(arithmeticOperations.piValue );
    }

    public int sum(int num1, int num2){
        System.out.println(PI_VALUE);
        System.out.println(piValue);
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

     long sum(byte num3, int num2){
        return num3 + num2;
    }

    public static int addition(int num3, int num2){
        return num3 + num2;
    }
}
