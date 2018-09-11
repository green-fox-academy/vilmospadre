import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> inc = number -> number + 1;
        int x = inc.apply(5);
        int y = increment(5);
        IntBinaryOperator add = (a, b) -> a + b;
        Consumer print = number -> System.out.println(number);
        print.accept(5);
        IntSupplier rand = () -> 4;
        IntPredicate isPositive = number -> number > 0;

    }
    static int increment(int number) {
        return number + 1;
    }
    int add(int a, int b) {
        return a + b;
    }
    void print(int a) {
        System.out.println(a);
    }
    int rand() {
        return 4;
    }
    boolean isPositive(int number) {
        return number > 0;
    }
}
