//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*SimpleArrayList<Integer> myList = new SimpleArrayList<>();
        //to add the elemnt in the arraylist
        for(int i = 1;i<= 15;i++){
            myList.add(i);
        }

        //to print the size of the list
        System.out.println("Size of the list: " + myList.size());

        //checj if certain elements are in the list
        System.out.println("list contain 10: " + myList.contains(10));
        System.out.println("List contains 20: " + myList.contains(20));

         */
        /*Node<Integer> head;

        head = new Node<>(12);
        head.next = new Node<>(99);
        head.next.next = new Node<>(37);

        //iterating through the list to understand and print all elemnets.
        Node<Integer> current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;*/

        LinkedList<Integer> testList = new LinkedList<>();

        // Add elements to the list
        testList.add(10);
        testList.add(5);
        testList.add(11);
        testList.add(21);
        testList.add(16);
        testList.add(3);

        // Print the list elements
        System.out.print("List elements: ");
        testList.printList();

        // Check if the list contains certain values
        System.out.println("List contains 3: " + testList.contains(3));
        System.out.println("List contains 100: " + testList.contains(100));

        // Print the size of the list
        System.out.println("Size of the list: " + testList.size());


        //
        DNode<Integer> head;
        head = new DNode<>(12);
        head.next = new DNode<>(99);
        head.next.previous = head;
        head.next.next = new DNode<>(37);
        head.next.next.previous = head.next;

        }
    }


