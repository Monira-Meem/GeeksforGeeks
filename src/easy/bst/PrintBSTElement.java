package easy.bst;

import java.util.ArrayList;

public class PrintBSTElement {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }


    ArrayList<Integer> printNearNodes(Node root, int low, int high) {

        ArrayList<Integer> list = new ArrayList<>();

        if (root != null) {
            printNearNodes(root.left,low,high);
            if (root.data >= low && root.data <= high)
                list.add(root.data);
            printNearNodes(root.right,low,high);
        }

        return list;
    }


}
