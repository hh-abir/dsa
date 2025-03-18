public class SinglyLinkedList {
    Node head;

    public static Node createFromArray(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    public static void printSLL(Node head){
        Node temp = head;
        while (temp != null) {
            if (temp.next != null){
               System.out.print(temp.elem+" -> ");
            }else{
                System.out.println(temp.elem);
            }
            temp = temp.next;
        }
    }
}
