public class BinaryTree {

  Node root;

  public Node getRoot(){
    return root;
  }

  public void add(int key, String data){

    Node n = new Node(key, data);

    if(root == null){
      root = n;
    } else {
      Node current = root;
      Node parent;
      while(true){
        parent = current;
        if(key < current.key){
          current = current.leftChild;
          if(current == null) {
            parent.leftChild = n;
            return;
          }
        } else {
          current = current.rightChild;
          if(current == null){
            parent.rightChild = n;
            return;
          }
        }
      }
    }

  }

  public Node find(int key){
    Node current = root;
    while(current.key != key){
      if(key < current.key){
        current = current.leftChild;
      } else {
        current = current.rightChild;
      }

      if(current == null){
        return null;
      }
    }
    return current;
  }

  public boolean remove(int key){
    Node parent = root;
    Node current = root;
    boolean isLeft = true;
    // this loop finds the node
    while(key != current.key){
      parent = current;
      if(key < current.key){
        isLeft = true;
        current = current.leftChild;
      } else {
        isLeft = false;
        current = current.rightChild;
      }

      if(current == null) {
        return false;
      }
    }
    // the node we found is a leaf node
    if(current.leftChild == null && current.rightChild == null){
      if(current == root){
        root = null;
      }
      else if(isLeft){
        parent.leftChild = null;
      }
      else {
        parent.rightChild = null;
      }
    }

    // if the node we found has no right child
    if(current.rightChild == null){
      if(current == root){
        root = current.leftChild;
      }
      else if(isLeft){
        parent.left = current.left;
      }
      else {
        parent.right = current.left;
      }
    }

    else if(current.leftChild == null){
      if(current == root){
        root = current.rightChild;
      }
      else if(isLeft){
        parent.leftChild = current.rightChild;
      }
      else {
        parent.rightChild = current.rightChild;
      }
    }
  }

  public void preorderTraversal(Node n){
    if(n != null){
      System.out.println(n);
      inOrderTraversal(n.leftChild);
      inOrderTraversal(n.rightChild);
    }
  }

  public void inOrderTraversal(Node n){
    if(n != null){
      inOrderTraversal(n.leftChild);
      System.out.println(n);
      inOrderTraversal(n.rightChild);
    }
  }

  public void postorderTraversal(Node n){
    if(n != null){
      inOrderTraversal(n.leftChild);
      inOrderTraversal(n.rightChild);
      System.out.println(n);
    }
  }


}
