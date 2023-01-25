package DSA.Arrays;

public class DynamicArray {
    public static void main(String args[]){
        DArray arr = new DArray(5);
        for(int i=1;i<=5;i++){
            arr.insert(i);
        }
        for(int i=0;i<arr.getSize();i++){
            System.out.print(arr.getEle(i)+" ");
        }
        System.out.println("\n"+arr.getSize());
        arr.insert(20);
        System.out.println(arr.getSize());

        System.out.println(arr.delete(arr.getSize()-1));

        for(int i=0;i<arr.getSize();i++){
            System.out.print(arr.getEle(i)+" ");
        }

    }
}


class DArray{
    private int arr[];
    private int capacity;
    private int count;

    public DArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.count = 0;
    }

    public void insert(int ele){
        if(isFull()){
            capacity = 2*capacity;
            int newArr[] = new int[capacity];
            for(int i=0;i<count;i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }

        arr[count] = ele;
        count++;
    }

    private boolean isFull() {
        return this.count == this.capacity;
    }

    public int delete(int index){
        if(index<0 && index > count){
            throw new RuntimeException();
        }
        int ele = arr[index];
        if(index == count-1){
            count--;
        }else{
            int i=index;
            while(i<count-1){
                arr[i] = arr[i+1];
            }
        }
        return ele;
    }

    public int getEle(int index){
        if(index<0 && index > count){
            throw new RuntimeException();
        }
        return arr[index];
    }

    public int getSize(){
        return count;
    }
}
