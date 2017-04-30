//package com.google.challenges;
import java.util.HashMap;
public class Answer {
    public static int[] answer(int h, int[] q) {
      int nodes = ((int)Math.pow(2, h)-1);
        Node parent = new Node(nodes);
        constructPartialTree(parent);
        final MemoArray memo = new MemoArray();
        int fluxes = q.length;
        int[] answer = new int[fluxes];
        for (int i = 0; i < fluxes; i++) {
          if (q[i] == nodes) {
            answer[i] = -1;
          } else {
            answer[i] = returnParentVal(q[i], parent);
          }
        }
        return answer;
    }
    private static int returnParentVal(int item, Node parent) {
      if (MemoArray.myMemo.containsKey(item)) {
          // return memo array value
          return MemoArray.myMemo.get(item);
      }
      Node itemNode = searchPartialTree(item, parent);
      if (itemNode != null) {
          MemoArray.myMemo.put(item, itemNode.parent.data);
        return itemNode.parent.data;
      }
      int nextBiggestVal;
      Node cursor = parent;
      //System.out.println(itemCounter);
      do {
        cursor = cursor.left;
        nextBiggestVal = cursor.data;
      } while (nextBiggestVal > item);
      //int nextBiggestVal = nextBiggest.data;
      //System.out.println(nextBiggestVal);
      int proxyVal = item - nextBiggestVal;
      //System.out.println(proxyVal);
      int proxyParent = returnParentVal(proxyVal, parent) + nextBiggestVal;
      MemoArray.myMemo.put(proxyVal, proxyParent);
      return proxyParent;
    }
    private static void constructPartialTree(Node parent) {
    if (parent.data == 1) {
      return;
    }
    Node right = new Node((parent.data)-1);
    parent.right = right;
    right.parent = parent;
    //System.out.println(parent.right.data);
    Node left = new Node(((parent.data)-1)/2);
    parent.left = left;
    left.parent = parent;
    //System.out.println(parent.left.data);
    constructPartialTree(parent.left);
    return;
  }
  private static Node searchPartialTree(int item, Node parent) {
    if (parent.data == item) {
      return parent;
    } else if (parent.right.data == item) {
      return parent.right;
    } else if (parent.left != null && parent.left.data >= item){
      parent = parent.left;
      return searchPartialTree(item, parent);
    } else {
      return null;
    }
  }
}

class MemoArray {
    public static HashMap<Integer, Integer> myMemo;
    public MemoArray() {
        myMemo = new HashMap<Integer, Integer>();
    }
}

class Node {
    Node left;
    Node right;
    Node parent;
    int data;
    public Node(int data) {
      this.data = data;
      this.right = null;
      this.left = null;
      this.parent = null;
    }
    public boolean hasRight() {
      return (this.right == null) ? false : true;
    }
    public boolean hasLeft() {
      return (this.left == null) ? false : true;
    }
    public boolean hasNoChildren() {
      return (this.left == null && this.right == null) ? true : false;
    }
  }
