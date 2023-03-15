public class Stack<D> {
    private ListNode<D> top;
    int length = 0;


    public void push(D data) {
        ListNode<D> temp = new ListNode<>(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public D pop() {
        if (isEmpty()){
            System.out.println("the stack is empty");
            return null;
        }
        D res = top.data;
        top = top.next;
        length--;
        return res;
    }

    public void show() {
        ListNode<D> temp = top;
        while (temp != null) {
            System.out.println("|" + temp.data + "|");
            temp = temp.next;
        }
    }

    public void peek() {
        if (isEmpty()){
            System.out.println("Stack is empty");
        }else {
            System.out.println(top.data);
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

}
