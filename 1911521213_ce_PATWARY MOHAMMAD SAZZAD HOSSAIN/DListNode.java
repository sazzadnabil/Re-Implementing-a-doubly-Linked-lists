package list;
public class DListNode extends ListNode{
    protected DListNode prev;
    protected DListNode next;
    DListNode(Object o, DList dl, DListNode p, DListNode n){
        item = o;
        myList = dl;
        prev = p;
        next = n;//Your code
    }

    public ListNode next() throws InvalidNodeException{
        if(!isValidNode()){throw new InvalidNodeException("next() is called on invalid node");}
        return next;//Your code
    }
    public ListNode prev() throws InvalidNodeException{
        if(!isValidNode()){throw new InvalidNodeException("prev() is called on invalid node");}
        return prev;//Your code
    }
    public void insertBefore(Object item) throws InvalidNodeException{
        if(!isValidNode()){throw new InvalidNodeException("insertBefore() is called on invalid node");}
        DListNode insBefore_Node = ((DList)this.myList).newNode(item, (DList)this.myList, this.prev, this);
        this.prev.next = insBefore_Node;
        this.prev = insBefore_Node;
        this.myList.size ++;//Your code
    }
    public void insertAfter(Object item) throws InvalidNodeException{
        if(!isValidNode()){throw new InvalidNodeException("insertAfter() is called on invalid node");}
        DListNode insAfter_Node = ((DList)this.myList).newNode(item, (DList)this.myList, this, this.next);
        this.next.prev = insAfter_Node;
        this.next = insAfter_Node;
        this.myList.size ++;//Your code
    }
    public void remove() throws InvalidNodeException{
        if(!isValidNode()){throw new InvalidNodeException("remove() is called on invalid node");}
        this.prev.next = this.next;
        this.next.prev = this.prev;
        this.myList.size --;//Your code
        prev = null;		next = null; 		myList = null;
    }
}
