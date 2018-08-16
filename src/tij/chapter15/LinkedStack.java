package tij.chapter15;

/**
 * class_name: LinkedStack
 * package: tij.chapter15
 * describe: 自定义内部链式存储机制
 * creat_user: haoxiaol
 * creat_date: 2018/8/16
 * creat_time: 16:36
 **/
public class LinkedStack<T> {

    private static class Node<U> {
        U item;
        Node<U> next;

        public Node() {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }

    }

    //默认栈底为null
    private Node<T> top = new Node<T>();

    //推进一个，移动栈顶，指向之前的元素
    public void push(T item) {
        top = new Node<>(item, top);
    }

    //推出下一个
    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {

        LinkedStack<String> list = new LinkedStack<>();
        for (String s : "hello you are friends".split(" ")) {
            list.push(s);
        }
        String s;
        while ((s = list.pop()) != null) {
            System.out.println(s);
        }
    }

}
