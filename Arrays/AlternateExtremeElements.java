package Arrays;
/*
printing alternate extreme element of an array
ex: [1,2,3,4,5,6] -> [1,6,2,5,3,4]

*/
public class AlternateExtremeElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int left=0;
        int right=arr.length-1;
        
        while(left<=right){
            System.out.println(arr[left]);
            left++;
            System.out.println(arr[right]);
            right--;

        }
        
    }
}
