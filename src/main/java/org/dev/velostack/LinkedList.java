    package org.dev.velostack;

    public class LinkedList {
        Node head;
        Node tail;


        public void insertAtHead(int data) { /// <---- inserts at the head position
            Node node = new Node(data);
            node.next = head;
            head = node;

        }

        public void printList() {           /// <----prints the entire linkedlist
            Node temp = head;              // just point to hea
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public void insertAtTail(int data) {
           Node node= new Node(data);
           if (head==null){
               head=node;
               return;

           }
           Node temp= head;
           while(temp.next!=null){
               temp=temp.next;

           }
           temp.next=node;
        }

        public void insertAtPosition(int data,int position){
            Node node=new Node(data);
            if(head==null){ /// <---- if the list is empty
                head=node;
                return;
            }
            Node temp= head;
            for (int i=0; i<position-1; i++){/// <----go till the previous postion
                if (temp == null) {
                    System.out.println("Position out of bounds");
                    return;
                }
                temp = temp.next; ///<----keep moving forward


            }
            node.next=temp.next; ///<----- at firstteh node.next was null but in this step the node.next acquires the temp.next
            temp.next=node; ///and temp.next turns node


        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.insertAtHead(52);
            list.insertAtHead(25);
            list.insertAtHead(2572);
            list.insertAtTail(87);
            list.insertAtPosition(546,2);
            list.printList();


        }
    }

