package experimental;

public class main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(0);
        System.out.println("Initially the list is...");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        //for leaving the line
        System.out.println(" ");

        //calling append method
        myLinkedList.append(1);
        myLinkedList.append(3);


        System.out.println("After adding the elements the list becomes :-");
        myLinkedList.printList();

        //for leaving the line
        System.out.println(" ");
        System.out.println(" ");

        myLinkedList.getLength();

        //for leaving the line
        System.out.println(" ");

        System.out.println("After removing...");
        //calling the remove method
        //returns 3
        System.out.println("removing the node with value " + myLinkedList.removeLast().value);
        //returns 1
        System.out.println("removing the node with value " + myLinkedList.removeLast().value);
        //returns 0
        System.out.println("removing the node with value " + myLinkedList.removeLast().value);
        //returns null
        System.out.println("removing the node with value " + myLinkedList.removeLast());


        //for leaving the line
        System.out.println(" ");

        System.out.print("Right now the LinkedList is : ");
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();

        //for changing the line
        System.out.println();

        //calling the prepend method
        System.out.print("prepending 0, the list becomes : ");
        myLinkedList.prepend(0);
        myLinkedList.printList();


        //for leaving the line
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Removing elements from the first...");
        //calling the removeFirst method
        //removing 0
        System.out.println("removing the node with value " + myLinkedList.removeFirst().value);
        //removing 1
        System.out.println("removing the node with value " + myLinkedList.removeFirst().value);
        //removing 2
        System.out.println("removing the node with value " + myLinkedList.removeFirst().value);
        //removing 3
        System.out.println("removing the node with value " + myLinkedList.removeFirst().value);
        //removing null
        System.out.println("removing the node with value " + myLinkedList.removeFirst());

        //for leaving the line
        System.out.println(" ");


        System.out.print("Right now the LinkedList is : ");
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();

        System.out.println(" ");

        //calling the reverse method
        System.out.print("After calling reverse method list becomes : ");
        myLinkedList.reverse();
        myLinkedList.printList();

        //for leaving the line
        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Inserting node with value 4 at index position 0 \nThe list becomes : ");
        //calling the insert method
        myLinkedList.insert(0,4);
        myLinkedList.printList();

        }
    }


