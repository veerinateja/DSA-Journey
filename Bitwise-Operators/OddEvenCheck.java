package Bitwise_Operators;
/*
program : odd or even check using bitwise operator

Logic : even number ends with 0 bit
        odd number ends with 1 bit 
        so number & 1 returns 0 -> if even 
                              1 -> if odd

*/
public class OddEvenCheck {
    public static void main(String[] args) {
        int num=15;
        if((num & 1)==0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num+" is odd");
        }
    }
}

