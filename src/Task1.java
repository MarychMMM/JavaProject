import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {



    Scanner inp = new Scanner(System.in);
    int size = inp.nextInt(),n = inp.nextInt();
    int[] arr = new int[size];
    for(int i=0 ;i<=size-1;i++)
    {

        arr[i]=inp.nextInt();
    }

    add_to_r(arr,n);


}

    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.

        int [] new_r = new int [r.length + 1];
        for (int i = 0; i< r.length; i++ ){
            new_r[i]=r[i];
        }
        new_r[r.length]=n;
        for (int element: new_r){
            System.out.println(element);
            System.out.println("mama");
        }
    }


}

