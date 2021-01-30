package taller1a;

import java.util.Scanner;

public class FinalExerciseThread extends Thread{

    private int maxLimit;

    private boolean odd;

    private long sleepMillis;

    public FinalExerciseThread(int maxLimit, boolean odd, long sleepMillis){
        this.maxLimit = maxLimit;
        this.odd = odd;
        this.sleepMillis = sleepMillis;
    }

    public void run(){
        try{
            for(int i=1; i<=this.maxLimit;i++){
                if(this.odd && i%2==1){
                    System.out.println(i);
                    Thread.sleep(sleepMillis);
                }
                else if(!this.odd && i%2==0){
                    System.out.println(i);
                    Thread.sleep(sleepMillis);
                }
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        long sleepMillis = 1000;
        Scanner sc = new Scanner(System.in);
        int maxLimit = Integer.parseInt(sc.nextLine());
        FinalExerciseThread threadOdd = new FinalExerciseThread(maxLimit,
                true, sleepMillis);
        FinalExerciseThread threadEven = new FinalExerciseThread(maxLimit,
                false, sleepMillis);
        threadOdd.start();
        threadEven.start();
    }


}
