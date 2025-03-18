public class ReverseandSwap {
    public static void main(String[] args) {
        int tar = 3;
        int[] arr = {5, 7, 6, 3, 8, 2, 1};
        Node head = SinglyLinkedList.createFromArray(arr);
        SinglyLinkedList.printSLL(head);

        Node prev = null;
        Node temp = head;
        int count = -1;
        while (count != tar) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count++;
        }
        Node tail = temp;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = prev;
        head = temp;
        
        SinglyLinkedList.printSLL(head);
    }   
}
