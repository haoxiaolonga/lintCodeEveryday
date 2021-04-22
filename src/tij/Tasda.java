package tij;

import java.util.Map;

class LFUCache {

    public static void main(String[] args) {
        LFUCache obj = new LFUCache(2);
        int param_1 = obj.get(2);
        obj.put(2, 2);
    }

    class Node {
        int key;
        int value;
        int nums;
        Node pre;
        Node next;

        public Node(int key, int value, int nums) {
            this.key = key;
            this.value = value;
            this.nums = nums;
        }

        public void addNums() {
            nums++;
        }
    }

    int capacity;
    Map<Integer, Node> map;
    Node head = null;
    Node tail = null;
    int size;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0, 0, Integer.MAX_VALUE);//头
        tail = new Node(-1, 0, -1);//尾巴
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node != null) {
            refresh(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            refresh(node);
            return;
        } else if (size == capacity) {//满了
            if (capacity == 0) return;
            removeLast();
            size--;
        }
        Node node = new Node(key, value, 0);
        addToLast(node);
        refresh(node);
        size++;
    }

    private void addToLast(Node node) {
        //放到tail的前一个
        Node pre = tail.pre;
        pre.next = node;
        node.pre = pre;

        node.next = tail;
        tail.pre = node;
        map.put(node.key, node);
    }

    private void removeLast() {
        //删除tail的前一个
        Node last = tail.pre;
        last.pre.next = tail;
        tail.pre = last.pre;
        map.remove(last.key);
    }

    private void refresh(Node node) {
        node.addNums();
        //前一个
        Node pre = node.pre;
        while (pre.nums <= node.nums) {

            //交换相邻两个节点的位置，修改指向的节点
            Node target = pre.pre; //目标
            Node end = node.next;//尾巴

            //建立新链接
            target.next = node;
            node.pre = target;

            //反转指向
            node.next = pre;
            pre.pre = node;

            //和尾巴建立链接
            pre.next = end;
            end.pre = pre;

            //为一个循环作准备
            pre = target;
        }
    }

}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */