package agh.po.lab3;

public class Codingbat {
    public boolean array123(int[] nums) {
        for (int i=0; i<( nums.length - 2); i++)
        {
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }
    public int array667(int[] nums) {
        int counter = 0;
        for(int i=1; i<nums.length ;i++){
            if(nums[i-1]==6 && (nums[i] == 6 || nums[i]==7)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        Codingbat codingbat = new Codingbat();
        System.out.println("wynik: "+ codingbat.array123(new int[]{1,2,3,4,5,6}));
    }
}
