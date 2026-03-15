package lr9.example6;

public class Test3 {
    public static void main(String[] args) {
        Node head = new Node(10, null);
        Node tail = head;

        for (int i = 9; i >= 0; i--){
            tail.next = new Node(i, null);
            tail = tail.next;
        }

        Node ref = head;
        while (ref != null){
            System.out.print(ref.value + " ");
            ref = ref.next;
        }

    }
}
