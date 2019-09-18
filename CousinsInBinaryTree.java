/**
 * LeetCode Execution: No Problem
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

 /**
  * Solution Type: BFS - Approach (Iterattive)
  */


  /**
  * Solution Type: DFS - Approach (Recursive)
  */

  class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
      int xdep = -1;
      int ydep = -1;
      TreeNode xpar = null;
      TreeNode ypar = null;

      findDepthHelper(root, 0, xdep, ydep, null);
    }

    public void findDepthHelper(TreeNode root, int depth, int x, int y, TreeNode parent) {
      // Base Case
      if (root == null) return;

      // Recursive Case
      if (root.val == x) {
        xdep = depth;
        xpar = parent;
      }

      if (root.val == y) {
        ydep = depth;
        ypar = parent;
      } 

      findDepthHelper(root.left, depth + 1, x, y, root);
      findDepthHelper(root.right, depth + 1, x, y, root);

    }
  }
