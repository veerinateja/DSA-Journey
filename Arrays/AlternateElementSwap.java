package Arrays;
/*
swap alternate element in an array
ex: input -> [2,4,6,8,10,11]
    output ->[4,2,8,6,11,10]

*/
public class AlternateElementSwap {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        for(int i=0;i<arr.length-1;i=i+2){
            arr[i]=arr[i]^arr[i+1];
            arr[i+1]=arr[i]^arr[i+1];
            arr[i]=arr[i]^arr[i+1];
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
