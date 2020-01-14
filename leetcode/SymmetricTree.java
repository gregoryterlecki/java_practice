/*
  Symmetric Tree
  EASY

  Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

  For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

      1
     / \
    2   2
   / \ / \
  3  4 4  3


  But the following [1,2,2,null,3,null,3] is not:

      1
     / \
    2   2
     \   \
     3    3
*/
public class SymmetricTree {

  public boolean isSymmetric(TreeNode left, TreeNode right){
    // checks if either node is null.
    // returns true if they are, and if one node is null while the other one
    // isn't, it will return false
    if(left == null || right == null)
      return left == right;

    // this is the check performed on symmetric sides of the tree.
    if(left.val != right.val)
      return false;


    // this creates two new callstacks. Both of these call stacks will be inspecting
    // a pair of nodes in the tree that are in symmetric locations from one another.
    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
  }

  public boolean solution(TreeNode root){
    if(root == null)
      return true;

    return isSymmetric(root.left, root.right);
  }

  public static void main(String[] args){
    // TODO implement the actual testing for this solution above
  }

};
