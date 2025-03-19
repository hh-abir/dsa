public class Pair_Wise_Equal {
    public static void main(String[] args) {
        int[] arr1 = {10, 15, 34, 42};
        int[] arr2 = {15, 10, 34, 41};
        Node head1 = SinglyLinkedList.createFromArray(arr1);
        Node head2 = SinglyLinkedList.createFromArray(arr2);
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null){
            if (temp1.elem != temp2.elem){
                if (temp1.elem != temp2.next.elem){
                    System.out.println("False");
                    return;
                }
            }
            if (temp1.next.elem != temp2.elem){
                if (temp1.next.elem != temp2.next.elem){
                    System.out.println("False");
                    return;
                }
            }
            temp1 = temp1.next.next;
            temp2 = temp2.next.next;
        }
        System.out.println("True");
    }
}
