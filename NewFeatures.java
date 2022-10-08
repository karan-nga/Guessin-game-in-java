import java.util.*;
public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
         boolean[] visited = new boolean[nums.length];
         backtrack(res ,nums,new ArrayList(),visited);
         return res;
    }
    
    public static void backtrack(List<List<Integer>> res,int[] nums,List<Integer> curr, boolean[] visited){
                if(curr.size()==nums.length){
                 res.add(new ArrayList(curr));
                    return;
                }

                for(int i=0;i<nums.length;i++){
                    if(visited[i]==true)continue;
                    curr.add(nums[i]);
                    visited[i] = true;
                    backtrack(res,nums, curr,visited);
                    curr.remove(curr.size()-1);
                    visited[i] = false;
                } 
            }
    
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ls= permute(arr);
        for(int i=0;i<ls.size();i++){
            for(int j=0;j<ls.get(i).size();j++){
                    System.out.println(ls.get(i).get(j));
            }
        }
    }
}
