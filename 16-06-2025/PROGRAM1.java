import java.util.ArrayList;
class Main {
    // Program for Backtracking
    public static void main(String[] args) {
        generateCominations("abc",0,"");
        int[] nums = {1, 2, 3};
        generateCominations(nums, 0, new ArrayList<>());
    }
    public static void generateCominations(String str,int index,String result){
        if(index == str.length()){
            System.out.println(result.length()!=0 ? result : "empty set");
            return;
        }
        generateCominations(str,index+1,result+str.charAt(index));
        generateCominations(str,index+1,result);
    }
    public static void generateCominations(int[] nums,int index,ArrayList<Integer> result)
    {
        if(index == nums.length){
            System.out.println(result);
            return;
        }
        result.add(nums[index]);
        generateCominations(nums,index+1,result);
        result.remove(result.size()-1);
        generateCominations(nums,index+1,result);
    }
}