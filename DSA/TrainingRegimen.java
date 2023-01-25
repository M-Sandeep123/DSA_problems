package DSA;

public class TrainingRegimen {
    public static void main(String args[]){
        int n = 4;
        System.out.println(training(n));
    }
    public static int training(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 3;
        }
        return training(n-1)+training(n-2)+training(n-3);
    }
}
