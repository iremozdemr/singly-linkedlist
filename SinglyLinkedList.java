public class SinglyLinkedList<D>{

    private static class Node<D>{

        private D data;
        private Node<D> nextN;

        public Node(D data, Node<D> nextN){
            this.data = data;
            this.nextN = nextN;
        }

        public D getData(){
            return data;
        }

        public void setData(D data){
            this.data = data;
        }

        public Node<D> getnextN(){
            return nextN;
        }

        public void setNextN(Node<D> nextN){
            this.nextN = nextN;
        }
    }

    private Node<D> head = null;
    private Node<D> tail = null;
    private int size = 0;

    @Override
    public String toString() {
        if(isEmpty()){
            return null;
        }
        else if(size == 1){
            return head.data.toString();
        }
        else{
            Node<D> newHead = head;
            String string= "";
            for(int i = 0; i<size; i++){
                string = string + " " + String.valueOf(newHead.data);
                newHead = newHead.nextN;
            }
            return string;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public D deleteByIndex(int index){
        if(isEmpty() || index<0 || index>=size){
            return null;
        }
        else if(index == 0){
            return removeFirst();
        }
        else if(index == size-1){
            return removeLast();
        }
        else{
            Node<D> newHead = head;
            for(int i = 0; i<index-1; i++){
                newHead = newHead.nextN;
            }
            D removedD = newHead.nextN.data;
            newHead.nextN = newHead.nextN.nextN;
            size--;
            return removedD; 
        }
    }

    public void addLast(D data){
        if(isEmpty()){
            Node<D> newNode = new Node<D>(data,null);
            head = newNode;
            tail = newNode;
        }
        else if(size == 1){
            Node<D> newNode = new Node<D>(data,null);
            head.nextN = newNode;
            tail = newNode;
        }
        else{
            Node<D> newNode = new Node<D>(data,null);
            tail.nextN = newNode;
            tail.nextN.data = data;
            tail = newNode;
            tail.nextN = null;
        }
        size++;
    }

    public void addFirst(D data){
        if(isEmpty()){
            Node<D> newNode = new Node<D>(data,null);
            head = newNode;
            tail = newNode;
        }
        else if(size == 1){
            Node<D> secondNode = head;
            Node<D> newNode = new Node<D>(data,secondNode);
            head = newNode;
        }
        else{
            Node<D> newNode = new Node<D>(data,head);
            head = newNode;
        }
        size++;
    }

    public D removeLast(){
        if(isEmpty()){
            return null;
        }
        else if(size == 1){
            D removedD = head.data;
            head = null;
            tail = null;
            size--;
            return removedD;
        }
        else{
            Node<D> newHead = head;
            Node<D> secondNode = null;
            for(int i = 0; i<size-1; i++){
                secondNode = newHead;
                newHead = newHead.nextN;
            }
            D removedD = secondNode.nextN.data;
            secondNode.nextN = null;
            tail = secondNode;
            size--;
            return removedD;
        }
    }

    public D removeFirst(){
        if(isEmpty()){
            return null;
        }
        else if(size == 1){
            D removedD = head.data;
            head = null;
            tail = null;
            size--;
            return removedD;
        }
        else{
            D removeD = head.data;
            head = head.nextN;
            size--;
            return removeD;
        }
    }
}