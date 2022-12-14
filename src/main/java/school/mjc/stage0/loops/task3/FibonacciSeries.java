package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int zero = 0;
        int first = 1;
        int second = 1;
        int sumFibonacci = 0;
        System.out.println(zero);
        System.out.println(first);
        System.out.println(second);
        for(int i = 3; i < lastFibonacci;i ++){
            sumFibonacci = first + second;
            System.out.println(sumFibonacci);
            first = second;
            second = sumFibonacci;
        }
    }
}
