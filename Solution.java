
import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Shoe arr[] = new Shoe[2];

        for(int i=0;i<n;i++){
            int number = Integer.parseInt(sc.nextLine());
            int count = Integer.parseInt(sc.nextLine());
            String category = sc.nextLine();
            String design = sc.nextLine();
            arr[i] = new Shoe(number,count,category,design);
        }
        //String cat = sc.nextLine();
//        //System.out.println(countTotalShoesForCategory(arr,cat));
//        Shoe obj = findShoeDesignWithNumber(arr,"sandals",8);
//        System.out.println(obj.getNumber()+" "+obj.getCount()+" "+obj.getCategory()+" "+obj.getDesign());

    }

    public static int countTotalShoesForCategory(Shoe arr[],String category){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCategory().equals(category)){
                return arr[i].getCount();
            }
        }

        return 0;
    }

    public static Shoe findShoeDesignWithNumber(Shoe arr[], String design, int number){
        Shoe obj = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getDesign().equals(design) && arr[i].getNumber() == number){
                obj = arr[i];
            }
        }
        return obj;
    }

}
