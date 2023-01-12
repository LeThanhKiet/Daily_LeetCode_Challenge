public class Daily_104 {
     class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
               this.val = val;
               this.left = left;
               this.right = right;
          }
     }

     public static int maxDepth(TreeNode root){
          if(root == null) return 0;
          int left = maxDepth(root.left);
          int right = maxDepth(root.right);

          return Math.max(left, right) + 1;
     }
}
