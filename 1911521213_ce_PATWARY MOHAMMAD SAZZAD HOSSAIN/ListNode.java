package list;
abstract public class ListNode{
    protected Object item;
    protected List myList;
    public boolean isValidNode(){
        return myList != null;	}

    //next() returns the node following this node. If this node is invalid, throws an exception.
    public abstract ListNode next() throws InvalidNodeException;

    //prev() returns the node preceding this node
    public abstract ListNode prev() throws InvalidNodeException;

    //insertBefore() inserts a node holding this "item" immediately preceding this node. If this node is invalid, throws an exception.
    public abstract void insertBefore(Object item) throws InvalidNodeException;

    // insertAfter() inserts a node holding this "item" immediately following this node. If this node is invalid, throws an exception.
    public abstract void insertAfter(Object item) throws InvalidNodeException;

    //remove() removes this node from its list. If this node is invalid, throws an exception.
    public abstract void remove() throws InvalidNodeException;
}
