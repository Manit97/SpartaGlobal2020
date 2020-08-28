package BinaryTree;


import Exceptions.ChildNotFoundException;
import org.sorters.Sorter;

public class BinaryTreeIMPL implements BinaryTree, Sorter {
    private final Node rootNode;
    private int[] sortedArray;
    private int count;
    private int numberOfNodes = 1;

    public BinaryTreeIMPL(final int element) {
        rootNode = new Node(element);
    }


    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {

    }

    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
                numberOfNodes++;
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (node.isRightChildEmpty()) {
            node.setRightChild(new Node(element));
            numberOfNodes++;
        } else {
            addNodeToTree(node.getRightChild(), element);
        }
    }


    public boolean findElement(final int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return 0;
    }

    //Ascending
    @Override
    public int[] getSortedTreeAsc() {
        sortedArray = new int [numberOfNodes];
        count = 0;
        sortTreeAsc(rootNode);
        return sortedArray;
    }

    private void sortTreeAsc(Node node){
        if (!node.isLeftChildEmpty()){
            sortTreeAsc(node.getLeftChild());
        }
        sortedArray[count] = node.getValue();
        count++;
        if (!node.isRightChildEmpty()){
            sortTreeAsc(node.getRightChild());
        }
    }

    //Descending
    @Override
    public int[] getSortedTreeDesc() {
        sortedArray = new int [numberOfNodes];
        count = 0;
        sortTreeDesc(rootNode);
        return sortedArray;
    }
    private void sortTreeDesc(Node node){
        if (!node.isRightChildEmpty()){
            sortTreeDesc(node.getRightChild());
        }
        sortedArray[count] = node.getValue();
        count++;
        if (!node.isLeftChildEmpty()){
            sortTreeDesc(node.getLeftChild());
        }

    }

    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    public int getNumberOfNodes() {
        return sortedArray.length;
    }

    @Override
    public Node getRootElement() {
        return rootNode;
    }

    @Override
    public int getNumberOfElements() {
        return sortedArray.length;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeIMPL binaryTreeIMPL = new BinaryTreeIMPL(arrayToSort[0]);
        for(int i = 1; i< arrayToSort.length; i++){
            binaryTreeIMPL.addElement(arrayToSort[i]);
        }
        int[] sortedArray = binaryTreeIMPL.getSortedTreeAsc();
        return sortedArray;
    }
}
