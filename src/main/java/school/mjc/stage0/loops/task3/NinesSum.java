package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sumNines = 0;
        int nine = 0;
        for(int i = 1; i<=lengthOfLastNumber; i++){
            nine = 9 + nine*10;
            sumNines = sumNines + nine;

        }
        System.out.println(sumNines);

    }
}
