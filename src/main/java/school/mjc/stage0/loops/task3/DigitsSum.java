package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum ;
        for (sum = 0 ; Math.abs(t) > 0 ; sum += t % 10 ,t /= 10 );
        int sumDigits = Math.abs(sum);
        System.out.println(sumDigits);

    }
}
