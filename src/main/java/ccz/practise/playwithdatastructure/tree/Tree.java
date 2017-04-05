package ccz.practise.playwithdatastructure.tree;

/**
 * Created by visionsky on 2017/4/5.
 */
public abstract class Tree {
    public abstract Tree getRoot();
    public abstract Tree getParent();
    public abstract Tree getLeftChild();
    public abstract Tree getRightChild();
    public abstract boolean isEmpty();
}
