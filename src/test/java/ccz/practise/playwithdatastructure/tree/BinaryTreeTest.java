package ccz.practise.playwithdatastructure.tree;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by 46043 on 2017/4/6.
 */
public class BinaryTreeTest {
    private BinaryTree<Integer> tree;

    @Before
    public void setUp() {
        tree = new BinaryTree<>(0);
    }

    @Test
    public void testPreOrderTraverse() {
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree4 = new BinaryTree(4);
        binaryTree1.addToLeftNode(binaryTree3);
        binaryTree1.addToRightNode(binaryTree4);

        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree5 = new BinaryTree(5);
        BinaryTree binaryTree6 = new BinaryTree(6);
        binaryTree2.addToLeftNode(binaryTree5);
        binaryTree2.addToRightNode(binaryTree6);

        tree.addToLeftNode(binaryTree1);
        tree.addToRightNode(binaryTree2);

        tree.preOrderTraverse();
        tree.inOrderTraverse();
        tree.postOrderTraverse();
    }
}
