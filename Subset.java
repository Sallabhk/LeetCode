public class Subset {

public  List<List<Integer>> subsets(int[] nums){

    List<List<Integer>> subsets = new ArrayList();
    dfs(subsets,0,nums,new ArrayList());
    return subsets;
  }
  
  void dfs(List<List<Integer>> subsets, int index, int[] nums, List<integer> current){
        subsets.add(new ArrayList(current));
        for(int i = index; i<nums.length;i++){
            current.add(nums[i]);
            dfs(subsets,i+1,nums,current);
            current.remove(current.size()-1);
        }
  }
  
}
