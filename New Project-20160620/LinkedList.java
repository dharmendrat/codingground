
public class LinkedList {
    Node first;
        
    public LinkedList() {
        first = null;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void insert(int d) {
        Node end = new Node(d);
        end.next = first;
        first = end;
    }
    public void insertAfter(int d, int extraD) {
        Node temp = first;
        while (temp != null) {
            if (temp.getData() == d) {
                Node newNode = new Node(extraD);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
    }
    public void delete(int d) {
        if (first == null) {
            throw new RuntimeException("Can't Delete");
        }
        if (first.getData() == d) {
            first = first.next;
        } else {
            Node temp = first;
            while(temp.next != null) {
                if (temp.next.getData() == d) {
                    temp.next = temp.next.next;
                    break;
                } 
                temp = temp.next;
            }
        }
    }
    void weave() {
        Node slow = first;
        Node fast = first;
        while(fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = first;
        while(slow != null || fast != null) {
            System.out.println(fast.getData());
            System.out.println(slow.getData());
            slow = slow.next;
            fast = fast.next;
        }
    }
    public void insertToTrail(int d) {
        Node end = new Node(d);
        Node tmp = first;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = end;
    }
    void display() {
        Node temp = first;
        while(temp != null) {
           System.out.println(temp.getData());
           temp = temp.next;
        }
        System.out.println();
    }
    void clear() {
        while(first != null) {
            first = first.next;
        }
    }
}
