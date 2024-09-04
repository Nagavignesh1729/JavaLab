class SinglyLinkList {
    public static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static class LinkList {
        Node head;
        public LinkList() {
            head = null;
        }
        void display() {
            Node current = head;
            while(current!=null) {
                System.out.print(current.val + " --> ");
                current = current.next;
            }
            System.out.print("null\n");
        }
        void insertAtBeginning(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
        void insertAtEnd(int val) {
            Node newNode = new Node(val);
            if(head == null)
                head = newNode;
            else {
                Node current = head;
                while(current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        void insertAtPosition(int val, int pos) {
            if (pos < 0 || pos > this.length()) {
                System.out.println("Invalid Position, out of range!");
                return;
            }
            Node newNode = new Node(val);
            if (pos == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node current = head;
            Node previous = null;
            while (pos > 0 && current != null) {
                previous = current;
                current = current.next;
                pos--;
            }
            if (previous != null) {
                previous.next = newNode;
                newNode.next = current;
            }
        }
        void insertAfterNode(int val, int valueToFind) {
            if(head == null) {
                System.out.println("List is empty buddy");
                return;
            }
            Node current = head;
            Node newNode = new Node(val);
            while (current.val != valueToFind && current.next != null) {
                current = current.next;
            }
            if(current.val == valueToFind) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("Node not found. Insertion failed.");
            }
        }
        void insertBeforeNode(int val, int valueToFind) {
            if(head == null) {
                System.out.println("List is empty buddy");
                return;
            }
            Node current = head;
            Node previous = null;
            Node newNode = new Node(val);
            while (current.val != valueToFind && current != null) {
                previous = current;
                current = current.next;
            }
            if(current.val == valueToFind && current != null) {
                if(previous == null) {
                    newNode.next = head;
                    head = newNode;
                } else {
                    newNode.next = current;
                    previous.next = newNode;
                }
            } else {
                System.out.println("Node not found. Insertion failed.");
            }
        }
        int length() {
            Node current = head;
            int count = 0;
            while(current!=null) {
                count++;
                current = current.next;
            }
            return count;
        }
        int countOccurances(int val) {
            Node current = head;
            int count = 0;
            while(current!=null) {
                if(current.val == val)
                    count++;
                current = current.next;
            }
            return count;
        }
        void deleteAtbeginning() {
            if(head == null) {
                System.out.println("Error, list is empty");
                return;
            }
            head = head.next;
        }
        Node deleteAtEnd() {
            if(head == null) {
                System.out.println("Error, list is empty");
                return null;
            }
            Node current = head;
            Node previous = current;
            while(current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;
        }
        void deleteByValue(int val) {
            if(head == null) {
                System.out.println("Error, list is empty");
                return;
            }
            Node current = head;
            Node previous = current;
            while(current.val != val && current.next != null) {
                previous = current;
                current = current.next;
            }
            if(current.val != val) {
                System.out.println("Cannot delete, Value not found!");
                return;
            }
            previous.next = current.next;
        }
        void deleteByPosition(int pos) {
            if(pos >= this.length())
                System.out.println("Invalid Position, out of range!");
            else if(pos < 0)
                System.out.println("Invalid Position, no negative postion allowed.");
            if (pos == 0) {
                head = head.next;
                return;
            }
            Node current = head;
            Node previous = null;

            while(pos > 0 && current != null) {
                previous = current;
                current = current.next;
                pos--;
            }
            if (previous != null && current != null) {
                previous.next = current.next;
            }
        } 
        void concatenate(LinkList list1) {
            Node current = head;
            if(current == null) {
                current = list1.head;
            }
            while(current.next != null) {
                current = current.next;
            }
            current.next = list1.head;
        }
        int search(int val) {
            int pos = 0;
            Node current = head;
            if(head == null)
                return -1;
            while(current.val != val && current.next != null) {
                current = current.next;
                pos++;
            }
            if(current.val == val)
                return pos;
            return -1;
        }
        void reverse() {
            if(head == null)
                return;
            Node current = head;
            Node previous = null;
            Node next = null;
            while(current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }
        int accessByPosition(int pos) {
            if(pos < 0 || pos >= this.length()) {
                System.out.println("Invalid Position!");
                return -1;
            }
            Node current = head;
            while(pos > 0) {
                current = current.next;
                pos--;
            }
            if(current != null)
                return current.val;
            return -1;
        }
        void sortList() {
           if (head == null) {
               return;
           }
           Node current = head;
           Node next_ = null;
           int temp;

           while (current != null) {
               next_ = current.next;
               while (next_ != null) {
                   if (current.val > next_.val) {
                       temp = current.val;
                       current.val = next_.val;
                       next_.val = temp;
                   }
                   next_ = next_.next;
               }
               current = current.next;
           }
       }
       void removeDuplicates() {
            if (head == null) {
                System.out.println("The list is empty you Moron!.");
                return;
            }
            Node current = head;
            while (current != null) {
                Node pointer = current;
                while (pointer.next != null) {
                    if (current.val == pointer.next.val)
                       pointer.next = pointer.next.next;
                    else
                        pointer = pointer.next;
                }
                current = current.next;
            }
        }
    }
   
    public static void main(String[] args) {
        System.out.println("Reg No: 2022503565\t\tName: Nagavignesh M");

        LinkList list1 = new LinkList();
        // Testing
       
        //list1.display();                    // null
        list1.insertAtBeginning(10);        // 10 --> null
        list1.insertAtBeginning(20);        // 20 --> 10 --> null
        //list1.display();
        list1.insertAtEnd(12);              // 20 --> 10 --> 12 --> null
        list1.insertAtEnd(18);              // 20 --> 10 --> 12 --> 18 --> null
        //list1.display();
        list1.insertAtPosition(5,0);        // 5 --> 20 --> 10 --> 12 --> 18 --> null
        //list1.insertAtPosition(10,100);     // Position out of range
        list1.insertAtPosition(7,3);        // 5 --> 20 --> 10 --> 7 --> 12 --> 18 --> null
        //list1.display();
        list1.insertAfterNode(15,12);       // 5 --> 20 --> 10 --> 7 --> 12 --> 15 --> 18 --> null
        list1.insertBeforeNode(1,5);        // 1 --> 5 --> 20 --> 10 --> 7 --> 12 --> 15 --> 18 --> null
        list1.insertBeforeNode(6,7);        // 1 --> 5 --> 20 --> 10 --> 6 --> 7 --> 12 --> 15 --> 18 --> null
        //list1.display();

        list1.deleteAtbeginning();          // 5 --> 20 --> 10 --> 6 --> 7 --> 12 --> 15 --> 18 --> null
        //list1.display();
        list1.deleteAtEnd();                // 5 --> 20 --> 10 --> 6 --> 7 --> 12 --> 15 --> null
        //list1.display();
        list1.deleteByValue(20);            // 5 --> 10 --> 6 --> 7 --> 12 --> 15 --> null
        //list1.display();
        list1.deleteByPosition(0);          // 10 --> 6 --> 7 --> 12 --> 15 --> null
        //list1.display();
        //list1.deleteByPosition(100);        // Position out of range;
        //list1.deleteByValue(99);            // Value not found
        //list1.display();

        //list1.display();                    // 10 --> 6 --> 7 --> 12 --> 15 --> null
        list1.reverse();                    // 15 --> 12 --> 7 --> 6 --> 10 --> null 
        //list1.display();

        /* Search and Access
        System.out.println("6 is at position: " + list1.search(6));
        System.out.println("Prints -1 if value not found: " + list1.search(101));
        System.out.println("Value at position 1: " + list1.accessByPosition(1));
        System.out.println("Value at position 100: " + list1.accessByPosition(100));
        */
       list1.insertAtBeginning(6);
       list1.insertAtEnd(6);

       list1.display();
       //ll = 6 --> 15 --> 12 --> 7 --> 6 --> 10 --> 6 --> null
       System.out.println("Length of Link List = " + list1.length());
       System.out.println("6 Occurred " + list1.countOccurances(6) +" times");
    }
}
