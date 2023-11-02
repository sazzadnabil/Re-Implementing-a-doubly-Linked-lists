package list;
abstract public class List{
    protected int size;
    //insertFront() inserts a node holding this "item" at the front of this list.
    public abstract void insertFront(Object item);
    //insertBack() inserts a node holding this "item" at the back of this list.
    public abstract void insertBack(Object item);
    public abstract ListNode front();
    public abstract ListNode back();
    public abstract String toString();
}
