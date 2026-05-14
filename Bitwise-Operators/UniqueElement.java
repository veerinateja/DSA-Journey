package Bitwise_Operators;
/* finding a uniue element in the array 
    Logic : xor cancles same numbers so unique number will be left 

*/
public class UniqueElement {
    public static void main(String[] args) {
        int[] arr={10,20,5,10,20,40,60,40,60};
        int unique_element=arr[0];
        for(int i=1;i<arr.length;i++){
            unique_element = arr[i] ^ unique_element;
        }
        System.out.println(unique_element);
    }
}
