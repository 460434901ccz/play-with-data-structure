package ccz.practise.playwithdatastructure.list;

/**
 * Created by visionsky on 2017/4/1.
 */
public class LinkedList<T> implements List<T> {
    private Node headNode;
    private Node tailNode;
    private int size;

    public LinkedList() {
        headNode = new Node(null, null, null);
        tailNode = new Node(null, headNode, headNode);
        headNode.nextNode = tailNode;
        headNode.preNode = tailNode;
    }

    @Override
    public boolean isEmpty() {
        return headNode.nextNode == tailNode;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        headNode.nextNode = tailNode;
        headNode.preNode = tailNode;
        tailNode.nextNode = headNode;
        tailNode.preNode = headNode;
        size = 0;
    }

    @Override
    public void add(T t) {
        Node newNode = new Node(t, tailNode, tailNode.preNode);
        tailNode.preNode.nextNode = newNode;
        tailNode.preNode = newNode;
        size++;
    }

    @Override
    public void addAll(List<T> anotherList) {
        for(int i=0; i<anotherList.size(); i++) {
            add(anotherList.get(i));
        }
    }

    @Override
    public T get(int index) {
        Node node = getNodeByIndex(index);
        return node.data;
    }

    private Node getNodeByIndex(int index) {
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        Node node = headNode.nextNode;
        int i = 0;
        while(i!=index && i<size()) {
            node = node.nextNode;
            i++;
        }
        return node;
    }

    @Override
    public void insert(T data, int index) {
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        Node node = getNodeByIndex(index);
        Node newNode = new Node(data, node, node.preNode);
        newNode.preNode.nextNode = newNode;
        newNode.nextNode.preNode = newNode;
        size++;
    }

    @Override
    public int index(T t) {
        Node node = headNode.nextNode;
        int index = 0;
        while(!t.equals(node.data) && node!=tailNode) {
            node = node.nextNode;
            index++;
        }
        if(node == tailNode) return -1;

        return index;
    }

    @Override
    public void remove(int index) {
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();

        final Node node = getNodeByIndex(index);
        node.preNode.nextNode = node.nextNode;
        node.nextNode.preNode = node.preNode;
        size--;
    }

    private class Node {
        private T data;
        private Node nextNode;
        private Node preNode;

        Node(T data, Node nextNode, Node preNode) {
            this.data = data;
            this.nextNode = nextNode;
            this.preNode = preNode;
        }
    }
}
