package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gsd = 0;
        for(int i = 1; i<= first || i <=second; i++){
            if (first % i ==0 && second % i ==0){
                gsd = i;
            }
        }
        System.out.println(gsd);

    }

}

