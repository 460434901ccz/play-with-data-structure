package ccz.practise.playwithdatastructure.tree;

/**
 * Created by visionsky on 2017/4/6.
 */
public class ParentRepresentationArrayTree<K, V> extends Tree {
    private TreeNode[] treeNodes;

    public ParentRepresentationArrayTree() {
        treeNodes = new ParentRepresentationArrayTree.TreeNode[10];
    }

    public void createTree(TreeNode[] trees) {
        check(trees);

        for(int i=0; i<trees.length; i++) {
            final TreeNode treeNode = (TreeNode) trees[i];
            treeNode.id = i;
            if(treeNode.parentKey == null) {
                treeNode.parentId = -1;
            } else {
                for(int j=0; j<trees.length; j++) {
                    final TreeNode parentTreeNode = (TreeNode) trees[j];
                    if(treeNode.parentKey.equals(parentTreeNode)) {
                        treeNode.parentId = j;
                        break;
                    }
                }
            }
        }
        treeNodes = (TreeNode[]) trees;
    }

    @Override
    public void insertNode(Tree parent, Tree tree) {

    }

    protected void check(TreeNode[] trees) {
        //检验所有的key有没有值，以及除了一个Node的parentKey无值，其它的parentKey都有值
        Object[] keyArray = new Object[trees.length];
        boolean hasRootKey = false;
        for(int i=0; i<trees.length; i++) {
            final TreeNode treeNode = (TreeNode) trees[i];

            if(!hasRootKey && treeNode.parentKey==null) {
                hasRootKey = true;
            } else if(hasRootKey && treeNode.parentKey==null) {
                throw new RuntimeException();
            }

            if(treeNode.key==null) throw new RuntimeException();

            for(int j=0; j<keyArray.length; j++) {
                if(treeNode.key.equals(keyArray[j])) throw new RuntimeException();
            }

            keyArray[i] = treeNode.key;
        }

        //检查有无无法找到的parentKey
        for(int i=0; i<trees.length; i++) {
            final TreeNode treeNode = (TreeNode)trees[i];
            boolean foundParentKeyOrIsRoot = false;
            for(int j=0; j<keyArray.length; j++) {
                if(treeNode.parentKey==null || treeNode.parentKey.equals(keyArray[j])) {
                    foundParentKeyOrIsRoot = true;
                    break;
                }
            }
            if(!foundParentKeyOrIsRoot) throw new RuntimeException();
        }
    }

    @Override
    public Tree getRoot() {
        Tree root = null;
        return root;
    }

    @Override
    public Tree getParent() {
        return null;
    }

    @Override
    public Tree getLeftChild() {
        return null;
    }

    @Override
    public Tree getRightChild() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return treeNodes.length;
    }

    public class TreeNode {
        private int id;
        private int parentId;
        private K parentKey;
        private K key;
        private V data;

        public TreeNode(K parentKey, K key, V data) {
            this.parentKey = parentKey;
            this.key = key;
            this.data = data;
        }

    }
}
