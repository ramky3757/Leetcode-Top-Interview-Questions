package src.easy.arrays;

public class Remove_Duplicates_sorted_array {
    public static void main(String[] args) {

        int[] arr = {0,0,1,1,2,2,3,3,4};
        if (arr.length <1){
            System.out.println("Array is empty");
        }

        int i=0; int j=1;
        while(j<arr.length){
            if(arr[j]>arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
            j++;
        }
        //this gives how many weren't duplicates in given array
        System.out.println(i+1);
    }
}