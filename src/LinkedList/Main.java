package LinkedList;

class LinkedList {
   private Node head;



    public void addFirst(int value){
        Node firstNode = new Node(value);
        firstNode.next = head;
        head = firstNode;
    }

    public void addLast(int value){
        if(head == null){
            Node lastNode = new Node(value);
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(value);

    }

    public int get(int value){
        if(head == null){
            return -1;
        }

        if(head.value == value){
            return 0;
        }

        Node currentNode = head;
        int count = 0;

        while(currentNode.value != value){
            ++count;
            if(currentNode.next.value == value){
                return count;
            }

            currentNode = currentNode.next;
        }

        return -1;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
    private static class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}


public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);


        System.out.println(linkedList);
        System.out.println(linkedList.get(2));

    }
}
