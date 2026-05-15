package Arrays;

import java.util.HashMap;

public class ModeOfArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3,6,6,5,4,5,6,9,8,7,8,9,4,5,6,1,2,3,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        //adding elements into the map
        for(int i=0;i<arr.length;i++){
           map.put(arr[i], map.getOrDefault(arr[i], 0)+1) ;
        }
        //finding the mode
        int max_key=-1;
        int max_key_value=-1;
        for(int i:map.keySet()){
            int current_key=i;
            int current_key_value=map.get(i);
            if(max_key_value<current_key_value){
                max_key=current_key;
                max_key_value=current_key_value;
            }
        }
        System.out.println(max_key);
        // for (int i : map.keySet()) {
        //     System.out.println(i+" -> "+map.get(i));
        // }
    }
}
