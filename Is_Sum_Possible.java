public class Is_Sum_Possible {
    public static void main(String[] args) {
        int[] arr = {5};
        Node head = SinglyLinkedList.createFromArray(arr);
        int tar = 5;
        Node temp = head;
        while (temp != null) {
            Node tNext = temp.next;
            while (tNext != null) {
                if (temp.elem + tNext.elem == tar){
                    System.out.println("True");
                    return;
                }
                tNext = tNext.next;
            }
            temp = temp.next;
        }
        System.out.println("False");

    }
}