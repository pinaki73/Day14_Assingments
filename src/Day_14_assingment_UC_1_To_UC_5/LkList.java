package Day_14_assingment_UC_1_To_UC_5;

public class LkList {
    static Node head;
    static Node tail;

    public static LkList insert( int data) {
        LkList l = new LkList();
        Node newNode = new Node(data);
        newNode.data= data;
        newNode.next= null;

        if (l.head == null) {
            l.head = newNode;
        } else {
            Node last = l.head;
            while (last.next != null)
                last = last.next;
                last.next = newNode;
        }
        return l;
    }
    public static LkList insertAtStart(int data){
        LkList l = new LkList();
        Node newNode = new Node(data);
        newNode.data= data;
        newNode.next= null;
        newNode.next= head;
        head = newNode;
        return l;
    }
    public static LkList insertAtAnyPoint(int index, int data){
        LkList l = new LkList();
        Node newNode = new Node(data);
        newNode.data= data;
        newNode.next= null;
        if (index == 0){
            insertAtStart(data);
        }
        Node n = head;
        for(int i = 0; i < index-1; i++) {
            n = n.next;
        }
        newNode.next = n.next;
        n.next = newNode;
        return l;
        }


    public static LkList deleteFirstElement(int index){
        LkList l = new LkList();
        if(index == 0){
            head = head.next;
        }return l;
    }



    public static LkList deleteElementAt(int index){
        LkList l = new LkList();
        Node n = head;
        Node n1 = null;
        for(int i = 0; i < index-1; i++){
            n = n.next;
        }
        n1 = n.next;
        n.next = n1.next;
        return l;
    }


    public static void print(LkList l) {
        Node currentNode = l.head;
        System.out.println("Linked List");
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }


    public static void main(String[] args) {
     LkList linklist = new LkList();
     linklist.insert(70);
     linklist.insert(56);
     linklist.insertAtStart(25);
     linklist.insertAtAnyPoint(2,30);
     linklist.deleteFirstElement(0);
     linklist.insert(60);
     linklist.deleteElementAt(2);
     linklist.deleteElementAt(2);
     linklist.print(linklist);
    }
}
