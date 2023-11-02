package list;

import list.DList;
import list.DListNode;
import list.InvalidNodeException;
class Test2{
    public static void main(String[] args) throws InvalidNodeException	{
        DList dl = new DList();
        dl.insertFront(3);		dl.insertFront(2);		dl.insertFront(1);
        dl.insertBack(4);		dl.insertBack(5); 		dl.insertBack(6);

        ((DListNode)(dl.back())).insertBefore(5.5);
        ((DListNode)(dl.front())).insertAfter(1.5);
        System.out.println(dl);//1,1.5, 2,3,4,5,5.5, 6
        ((DListNode)(dl.front())).remove();
        System.out.println(dl);//1.5, 2,3,4,5,5.5, 6
    }
}
