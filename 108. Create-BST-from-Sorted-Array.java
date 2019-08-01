/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
     int size = nums.length;
        if(size<=0)return null;
        int left = 0,right = size-1;
        return sortedArrayToBst(left,right,nums);
    }
    
    private TreeNode sortedArrayToBst(int left, int right, int[] array){
        if(left>right)return null;
        
        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(array[mid]);
        root.left= sortedArrayToBst(left,mid-1,array);
        root.right= sortedArrayToBst(mid+1,right,array);
        return root;
    }
}
