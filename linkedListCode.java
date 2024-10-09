public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    //Node class
    class Node{
        int value;
        Node next;

        //constructor
        public Node(int value){
            this.value=value;
        }
    }

    //constructor of LinkedList
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head : " + head.value);
    }
    public void getTail(){
        System.out.println("Tail : " + tail.value);
    }
    public void getLength(){
        System.out.println("Length : " + length);
    }

    //Operations performed on LinkedList are :-
    //1.append()
    //2.removeLast()
    //3.prepend()
    //4.removeFirst()
    //5.get()
    //6.set()
    //7.insert()
    //8.remove()
    //9.reverse()

    //appending the element in the last of the LinkedList
    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //removing the element from LinkedList
    public Node removeLast(){
        if(length==0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    //prepend an element
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    //removing the first item from the list
    public Node removeFirst(){
        if(length==0) return null;
        Node temp = head;
        head = head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail = null;
        }
        return temp;
    }

    //get a value of particular node
    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    //set method
    public boolean set(int index,int value){
        Node temp = get(index);
        if (temp  !=  null){
            temp.value = value;
            return true;
        }
        return  false;
    }

    //adding a new value to a particular index
    public boolean insert(int index,int value){
        if(index<0 || index>length){
            return false;
        }if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }

    //remove element from particular index
    public Node remove(int index){
        if(index<0 || index>length) return null;
        if(index==0) return removeFirst();
        if(index==length-1) return removeLast();

        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }

    //reverse the linkedList
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

}

