package Bitwise_Operators;
/*
xor Logic : 1 -> if both bits are DIFFERENT
            0 -> if both bits are SAME
SO,
a=20^50
b=(20^50)^50 ,then b= 20
a=(20^50)^20 ,then a=50

*/

public class SwappingNumbers {
    public static void main(String[] args) {
        int a=20;
        int b=50;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = "+a+"\nb = "+b);
    }
}
