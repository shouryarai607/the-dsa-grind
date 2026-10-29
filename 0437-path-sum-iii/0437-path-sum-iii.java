/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int total=0;
    public int pathSum(TreeNode root, int targetSum) {
        total=0;
        

        HashMap<Long, Integer>map= new HashMap<>();
        map.put(0L, 1);
        findpathsum(root, 0L, targetSum, map);
        return total;
    }
    public void findpathsum(TreeNode curr, long sum, int target, HashMap<Long, Integer>map){
        if(curr == null){
            return;
        }
        sum += curr.val;
        if(map.containsKey(sum-target)){
            total += map.get(sum-target);
        }
        map.put(sum, map.getOrDefault(sum, 0)+1);
        
        findpathsum(curr.left, sum, target, map);
        findpathsum(curr.right, sum, target, map);

        map.put(sum, map.get(sum)-1);
        return;
    }
}