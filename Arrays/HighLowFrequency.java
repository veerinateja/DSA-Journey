package Arrays;

import java.util.HashMap;

//find highest and lowest frequency in an array
public class HighLowFrequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,1,2,3,1,2,3,1,2,415,4,5,1,2,1,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        //adding elements to hashmap
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int high_freq=Integer.MIN_VALUE;
        int low_freq=Integer.MAX_VALUE;
        int low_freq_key=0;
        int high_freq_key=0;
        for (int key : map.keySet()) {
            int current_freq_value=map.get(key);
            
            if(current_freq_value<low_freq){
                low_freq=current_freq_value;
                low_freq_key=key;
            }
            if(current_freq_value>high_freq){
                high_freq=current_freq_value;
                high_freq_key=key;
            }
        }
        System.out.println("Low-Frequency key -> "+low_freq_key);
        System.out.println("High-Frequency key -> "+high_freq_key);
    }
}
