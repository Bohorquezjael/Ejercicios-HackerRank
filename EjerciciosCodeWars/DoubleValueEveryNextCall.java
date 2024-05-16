public class DoubleValueEveryNextCall {
    static int counter;
    static int value = 1;
    public static int getNumber() {
        counter++;
        return counter > 1 ? value *= 2 : value;
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(DoubleValueEveryNextCall.getNumber());
        System.out.println(DoubleValueEveryNextCall.getNumber());
        System.out.println(DoubleValueEveryNextCall.getNumber());
        System.out.println(DoubleValueEveryNextCall.getNumber());
    }
}