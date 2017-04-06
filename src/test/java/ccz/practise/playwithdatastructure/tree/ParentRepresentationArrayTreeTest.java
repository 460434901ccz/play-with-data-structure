package ccz.practise.playwithdatastructure.tree;

import org.junit.Test;

/**
 * Created by visionsky on 2017/4/6.
 */
public class ParentRepresentationArrayTreeTest {
    @Test
    public void testCheck() {
        final ParentRepresentationArrayTree tree = new ParentRepresentationArrayTree();

        ParentRepresentationArrayTree.TreeNode[] treeNodes = new ParentRepresentationArrayTree.TreeNode[7];

        treeNodes[0] = tree.new TreeNode(null, "1", "1");
        treeNodes[1] = tree.new TreeNode("1", "1-1", "1-1");
        treeNodes[2] = tree.new TreeNode("1", "1-2", "1-2");
        treeNodes[3] = tree.new TreeNode("1-1", "1-1-1", "1-1-1");
        treeNodes[4] = tree.new TreeNode("1-1", "1-1-2", "1-1-2");
        treeNodes[5] = tree.new TreeNode("1-2", "1-2-1", "1-2-1");
        treeNodes[6] = tree.new TreeNode("1-2", "1-2-2", "1-2-2");

        tree.check(treeNodes);
    }
}