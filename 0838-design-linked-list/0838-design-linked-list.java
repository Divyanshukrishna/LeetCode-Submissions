class MyLinkedList {
    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;
    int curr_size = 0;
    public MyLinkedList() {
    }
    
    public int get(int index) {
        if(index < 0 || curr_size <=index){
            return -1;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    private Node getNodeAtIndex(int index){
        if(index<0 || index>=curr_size){
            return null;
        }
        Node temp = head;

        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    
    public void addAtHead(int val) {
        Node newTemp = new Node(val);
        newTemp.next = head;
        head = newTemp;
        if(curr_size == 0){
            tail =head;
        }
        curr_size++;
    }
    
    public void addAtTail(int val) {
        if(curr_size == 0){
            addAtHead(val);
        }else{
            tail.next = new Node(val);
            tail = tail.next;
            curr_size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > curr_size)
            return;
        else if(index == 0)
            addAtHead(val);
        else if(index == curr_size)
            addAtTail(val);
        else {
            Node newNode = new Node(val);
            Node prevNode = getNodeAtIndex(index-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            curr_size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= curr_size)
            return;
        else if(curr_size == 1){
            head = null;
            tail = null;
        } else if(index == 0){
            head = head.next;
        } else if(index == curr_size-1){
            Node previousNode = getNodeAtIndex(index-1);
            previousNode.next = null;
            tail = previousNode;
        } else {
            Node previousNode = getNodeAtIndex(index-1);
            previousNode.next = previousNode.next.next;
        }
        curr_size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */