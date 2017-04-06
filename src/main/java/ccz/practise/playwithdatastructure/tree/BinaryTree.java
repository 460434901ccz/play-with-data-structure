package ccz.practise.playwithdatastructure.tree;

/**
 * Created by 46043 on 2017/4/6.
 */
public class BinaryTree<T> {
    private T data;
    private BinaryTree<T> leftNode;
    private BinaryTree<T> rightNode;

    public BinaryTree(T data) {
        this.data = data;
    }

    public void addToLeftNode(BinaryTree binaryTree) {
        leftNode = binaryTree;
    }

    public void addToRightNode(BinaryTree binaryTree) {
        rightNode = binaryTree;
    }

    public void preOrderTraverse() {
        if(data != null) System.out.println(data);
        if(leftNode!=null) this.leftNode.preOrderTraverse();
        if(rightNode!=null) this.rightNode.preOrderTraverse();
    }

    public void inOrderTraverse() {
        if(leftNode!=null) this.leftNode.preOrderTraverse();
        if(data != null) System.out.println(data);
        if(rightNode!=null) this.rightNode.preOrderTraverse();
    }

    public void postOrderTraverse() {
        if(leftNode!=null) this.leftNode.preOrderTraverse();
        if(rightNode!=null) this.rightNode.preOrderTraverse();
        if(data != null) System.out.println(data);
    }
}
