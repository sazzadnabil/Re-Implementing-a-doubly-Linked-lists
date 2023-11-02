package list;
public class DList extends List{
    protected DListNode head;
    protected DListNode newNode(Object item, DList list, DListNode prev, DListNode next){
        return new DListNode(item, list, prev, next);
    }
    public DList(){
        head = newNode(null, null, null, null);
        head.next = head;
        head.prev = head;
        head.myList = this;//Your code
    }

    public void insertFront(Object item){
        DListNode newest  = newNode(item, this, head, head.next);
        head.next.prev = newest;
        head.next = newest;
        size ++;//Your code
    }

    public void insertBack(Object item){
        DListNode newest  = newNode(item, this, head.prev, head);
        head.prev.next = newest;
        head.prev = newest;
        size ++;//Your code
    }

    public ListNode front(){		return head.next; 	}
    public ListNode back(){		return head.prev; 	}
    public String toString(){
        String result = "[  ";
        DListNode current = head.next;
        while (current != head) {
            result = result + current.item + "  ";
            current = current.next;
        }
        result = result + "]";
        return result;//Your code
    }
}
