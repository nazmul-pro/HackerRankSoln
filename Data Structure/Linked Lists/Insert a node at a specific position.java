/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    if (position == 0) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        return node;
    }
    head.next = InsertNth(head.next, data, position - 1);
    return head;
}