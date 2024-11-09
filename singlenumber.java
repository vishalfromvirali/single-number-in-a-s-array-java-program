import java.util.*;
class singlenumber{
    public static void main(String[]args){
        int[] nums={1,1,3};
        int value=0;
        for(int n:nums){
            value =value^n;
        }
        System.out.println("single number"+value);
    }
}