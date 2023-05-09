class LinkedList{

    Node head; // head of the list

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Inserts a new node at front of the list
    public void push(int new_data) {

        // 1&2: Allocate the Node & Put in the data
        Node new_node = new Node(new_data);

        // 3. Make next of the new node as head
        new_node.next = head;
        // 4. Move the head to point to new node
        head = new_node;
    }

    // Inserts a new node after the given previous node

    public void insertAfter(Node prev_node, int new_data) {
        // 1. Check if the given Node is full

        if (prev_node == null) {
            System.out.println("The given previous node can't be null");
            return;
        }

        // 2&3: Allocate the Node & Put in the data

        Node new_node = new Node(new_data);

        // 4.Make next of the new node as next of the prev_node

        new_node.next = prev_node.next;
        // 5. Make next of pre_node as new_node
        prev_node.next = new_node;
    }

    // Appends a new node at the end. This method is defined inside LinkedList class

    public void append(int new_data) {
        // 1.Allocate the Node &
        // 2.Put in the data
        // 3.Set next as null

        Node new_node = new Node(new_data);

        // 4.If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        // 5. This new node is going to be the las node, so make next of it as null

        new_node = null;

        // 6. Else traverse till the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;

            // 7. Change the next of the last node
            last.next = new_node;
            return;
        }

    }

    // This function prints contents of linked list starting from the given node

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.append(10);

        llist.push(3);

        llist.push(8);

        llist.append(4);

        llist.insertAfter(llist.head.next, 8);

        System.out.println("Created Linked LIst is:");
        llist.printList();
    }
}