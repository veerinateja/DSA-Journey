package Bitwise_Operators;

public class SetBit {
    
    public static void main(String[] args) {
        int bit=5;
        //to find last set bit
        int last_set_bit=bit & -bit;
        System.out.println(last_set_bit);

        //to remove last set bit ( n & (n-1) )
        // n   = 6 -> 1 0 1
        // n-1 = 5 -> 1 1 0
        
//removed last bit -> 1 0 0
        int n=6;
        System.out.println(n & (n-1));


//counting the set bits
        int num=11;
        int count=0;
        while(num!=0){
            if((num&1)==1) count++;
            num = num>>1;
        }
        System.out.println(count);
    }
}
