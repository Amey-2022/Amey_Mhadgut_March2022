import java.util.Scanner;
class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    Node trav = null;
    Node temp = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {

        trav = head;

        if (head == null) {
            System.out.println(" Linkedlist is empty");
            return;
        }

        System.out.print("Singly Linked list : ");
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();

    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        display();
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = newNode;
        display();
    }

    public void insertNode(int data, int pos) {
        Node newNode = new Node(data);
        trav = head;
        int count = 1;
        if (count == pos) {
            insertAtFirst(data);

        } else {
            while (count < pos - 1) {
                trav = trav.next;
                count++;
            }
            newNode.next = trav.next;
            trav.next = newNode;
            display();
        }
    }

    public void deleteAtFirst() {
        head = head.next;
        display();
    }

    public void deleteAtEnd() {
        trav = head;
        if (trav.next == null) {
            head = null;
            display();
        } else {
            while (trav.next != null) {
                temp = trav;
                trav = trav.next;
            }
            temp.next = null;
            display();
        }
    }

    public void deleteAtGivenPosition(int pos) {
        trav = head;
        int count = 1;
        if (pos == 1) {
            deleteAtFirst();
        } else {
            while (count < pos - 1) {
                trav = trav.next;
                count++;
            }
            temp = trav.next;
            trav.next = temp.next;
            temp = null;
            display();
        }

    }

    public void deleteNode(int data) {
        Node prevNode = null;
        trav = head;
        //finding length of linkedlist
        temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        while (trav != null) {

            if (trav.data == data) {
                if (trav == head && count == 1) {
                    head = null;
                    display();
                    break;
                } else if (trav.next == null) {
                    deleteAtEnd();
                    break;
                } else if (trav == head) {
                    head = trav.next;
                    display();
                    break;
                } else {
                    prevNode.next = trav.next;
                    trav = null;
                    display();
                    break;
                }
            }
            prevNode = trav;
            trav = trav.next;

        }
  
  }

    public void deleteAll() {
        head = null;
        display();
    }

    public void length() {
        temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("The length of Linked List is " + count);

    }

    public void sortLinkedList() {

        Node index = null;
        trav = head;
        int tempvar;
        Scanner sc = new Scanner(System.in);
        System.out.print(" 1.Ascending Order \n 2.Descending Order\nEnter Choice : ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                if (head == null) {
                    display();
                    return;
                } else {
                    while (trav != null) {
                        index = trav.next;
                        while (index != null) {
                            if (trav.data > index.data) {
                                tempvar = trav.data;
                                trav.data = index.data;
                                index.data = tempvar;
                            }
                            index = index.next;
                        }
                        trav = trav.next;
                    }
                }
                display();
                break;
            case 2:
                if (head == null) {
                    display();
                    return;
                } else {
                    while (trav != null) {
                        index = trav.next;
                        while (index != null) {
                            if (trav.data < index.data) {
                                tempvar = trav.data;
                                trav.data = index.data;
                                index.data = tempvar;
                            }
                            index = index.next;
                        }
                        trav = trav.next;
                    }
                }
                display();
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
  
  }

    public void reverse() {
        Node prevNode = null;
        Node nextNode = null;
        trav = nextNode = head;
        System.out.print("Reverse ");
        while (nextNode != null) {
            nextNode = nextNode.next;
            trav.next = prevNode;
            prevNode = trav;
            trav = nextNode;
        }
        head = prevNode;
        display();
    }

    public void searchNode(int data) {
        trav = head;
        int count = 0, flag = 0;
        while (trav != null) {
            count++;
            if (trav.data == data) {
                flag = 1;
                break;
            }
            trav = trav.next;
        }
        if (flag == 1)
            System.out.println("The Searching element " + data + " is found at position : " + count);
        else if (flag == 0)
            System.out.println("The Searching element " + data + " is not found in Linked List");
    }

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        Scanner sc = new Scanner(System.in);
        int ch = 1;
        while (ch == 1) {
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t\tLINKED    LIST    OPERATIONS\n");
            System.out.println("\t1.AddNode\t\t\t\t2.Insert Node at Beginning\t3.Insert Node at End\n\t4.Insert Node at Given Position\t\t5.Delete First Node\t\t6.Delete Last Node\n\t7.Delete Node at Given Position\t\t8.Delete Node\t\t\t9.Delete All Nodes\n\t10.Search Node\t\t\t\t11.Length of LinkedList\t\t12.Reverse LinkedList\n\t13.Sort Linkedlist\t\t\t14.Display\t\t\t15.Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Add Node :");
                    int n1 = sc.nextInt();
                    l.addNode(n1);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Insert Node at Beginning :");
                    int n2 = sc.nextInt();
                    l.insertAtFirst(n2);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Insert Node at End :");
                    int n3 = sc.nextInt();
                    l.insertAtEnd(n3);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Insert Node :");
                    int n4 = sc.nextInt();
                    System.out.print("Enter position :");
                    int pos = sc.nextInt();
                    l.insertNode(n4, pos);
                    System.out.println();
                    break;
                case 5:
                    l.deleteAtFirst();
                    System.out.println();
                    break;
                case 6:
                    l.deleteAtEnd();
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Enter position :");
                    int pos1 = sc.nextInt();
                    l.deleteAtGivenPosition(pos1);
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Enter Element from Linked List :");
                    int n5 = sc.nextInt();
                    l.deleteNode(n5);
                    System.out.println();
                    break;
                case 9:
                    l.deleteAll();
                    System.out.println();
                    break;
                case 10:
                    System.out.print("Enter Element from Linked List :");
                    int n = sc.nextInt();
                    l.searchNode(n);
                    System.out.println();
                    break;
                case 11:
                    l.length();
                    System.out.println();
                    break;
                case 12:
                    l.reverse();
                    System.out.println();
                    break;
                case 13:
                    l.sortLinkedList();
                    System.out.println();
                    break;
                case 14:
                    l.display();
                    System.out.println();
                    break;
                case 15:
                    ch = 0;
                    break;
                default:
                    System.out.println("Invalid Choice\n");
                    break;
            }
        }
    }
}