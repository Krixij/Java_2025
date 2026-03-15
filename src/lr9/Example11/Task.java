package lr9.Example11;



/*
Разработать проект, в котором для ввода, вывода и изменения
односвязного линейного списка испоьльзуются методы:
 */
public class Task {
    private Node head;

    public void createHead(){
        head = null;
        for (int i = 9; i >= 0; i--){
            head = new Node(i, head);
        }

    }

    public String toString(){
        String res = "";
        Node ref = head;
        while (ref != null){
            res += ref.value + " ";
            ref = ref.next;
        }
        return res;
    }
    public void createTail(){
        head = new Node(10, null);
        Node tail = head;

        for (int i = 9; i >= 0; i--){
            tail.next = new Node(i, null);
            tail = tail.next;
        }
    }

    public void addFirst(int num){
        head = new Node(num, head);
    }

    public void addLast(int num){
        Node currentTail = head;
        while (currentTail.next != null){
            currentTail = currentTail.next;
        }
        currentTail.next = new Node (num, null);

    }

    public void insert(int index, int num){
        if (index < 0){
            return;
        } else if (index == 0) {
            head = new Node(num, head);
            return;
        } else {
            Node currentIndex = head;
            int count = 0;
            while (currentIndex != null && count < index - 1){
                currentIndex = currentIndex.next;
                count++;
            }
            if (currentIndex == null){
                System.out.println("Метод insert: Индекс больше, чем список, ошибка");
                return;
            }
            currentIndex.next = new Node(num, currentIndex.next);
        }
    }

    public void removeFirst(){
        if (head == null){
            System.out.println("Список пустой");
            return;
        }
        head = head.next;
    }

    public void removeLast(){
        if (head == null){
            System.out.println("Список пустой");
            return;
        } else if (head.next == null){
            head = null;
            return;
        }

        Node currentTail = head;
        while(currentTail.next.next != null){
            currentTail = currentTail.next;
        }
        currentTail.next = null;
    }

    public void remove(int index){
        if (head == null){
            System.out.println("Список пустой");
            return;
        }
        if (index < 0){
            return;
        } else if (head.next == null && index == 0){
            head = null;
            return;
        } else if (index == 0) {
            head = head.next;
            return;
        }else {
            Node currentIndex = head;
            int count = 0;
            while (currentIndex != null && count < index - 1){
                currentIndex = currentIndex.next;
                count++;
            }
            if (currentIndex == null){
                System.out.println("Метод remove(): Индекс больше, чем список, ошибка");
                return;
            }
            currentIndex.next = currentIndex.next.next;
        }
    }

    public void createHeadRec(){
        head = createHeadRecCurrent(0);
    }

    private Node createHeadRecCurrent(int num){
        if (num > 9){
            return null;
        }
        return new Node(num, createHeadRecCurrent(num + 1));
    }

    public void createTailRec(){
        head = new Node(10, null);
        createTailRecCurrent(head, 9);
    }

    private void createTailRecCurrent(Node tail, int num){
       if (num < 0){
            return;
       }
       tail.next = new Node(num, null);
       createTailRecCurrent(tail.next, num - 1);
    }

    public String toStringRec(){
        return toStringRecCurrent(head);
    }
    private String toStringRecCurrent(Node res){
        if (res == null){
            return "";
        }
        return res.value + " " + toStringRecCurrent(res.next);
    }

    public static void main(String[] args) {
        Task list = new Task();

        list.createHead();
        System.out.println("Ввод с головы createHead(): " + list.toString());

        list.createTail();
        System.out.println("Ввод с хвоста createTail(): " + list.toString());

        list.addFirst(12);
        System.out.println("Ввод элемента в начало списка AddFirst(): " + list.toString());

        list.addLast(-1);
        System.out.println("Ввод элемента в конец списка AddLast(): " + list.toString());

        list.insert(1, 11);
        System.out.println("Ввод элемента в список с указанным номером Insert(): " + list.toString());

        list.removeFirst();
        System.out.println("Удаление элемента с головы списка RemoveFirst(): " + list.toString());

        list.removeLast();
        System.out.println("Удаление последнего элемента списка RemoveLast(): " + list.toString());

        list.remove(5);
        System.out.println("Удаление из списка элемента с указанным номером Remove(): " + list.toString());

        list.createHeadRec();
        System.out.println("Ввод с головы createHeadRec(): " + list.toStringRec());

        list.createTailRec();
        System.out.println("Ввод с хвоста createTailRec(): " + list.toStringRec());
    }
}
