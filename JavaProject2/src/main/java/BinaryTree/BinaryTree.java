package BinaryTree;

import Exceptions.ChildNotFoundException;

public interface BinaryTree {
    Node getRootElement();
    int getNumberOfElements();
    void addElement(int element);
    void addElements(int[] elements);
    boolean findElement(int value);
    int getLeftChild(int element) throws ChildNotFoundException;
    int getRightChild(int element) throws ChildNotFoundException;
    int[] getSortedTreeAsc();
    int[] getSortedTreeDesc();
}