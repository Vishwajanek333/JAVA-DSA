class LLR{
        Node head;
        private int size;// it for only to track the size of ll

        LLR(){ // constructer
            this.size =0;
        }


        class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next =null;
                size++;

            }
        }
        // 1)add-firstnode
        public void addFirst(int data){
            Node newNode = new Node(data);// create new node
            if(head == null){
                head = newNode;
                return;

            }

            newNode.next =head;
            head =newNode;
        }
        // 2)lastnode
        public void addlast(int data){
            Node newNode = new Node(data);// create new node
            if(head == null){
                head = newNode;
                return;
            }else{
                Node currNode = head; // to traves  node
                while(currNode.next!=null){ //
                    currNode = currNode.next;
                }
                currNode.next =newNode;// curr node.next is the last node
            } }
        //print
        public void printList(){
            if(head == null){
                System.out.println("list empty");
                return;
            }
            Node currNode = head ;
            while(currNode != null){ // not next bcz we want all nodes
                System.out.print(currNode.data + " ->");
                currNode =currNode.next;
            }
            System.out.println("NUll");
        }
        // delete first node
        public void deleteFirst(){
            if(head == null){
                System.out.println("this list is empty");
                return ;
            }
            size--;
            head =head.next;

        }

        // delete last node
        public void deleteLast(){
            if(head == null){ // corner case list empty
                System.out.println("this list is empty");
                return ;
            }

            size--;
            if(head.next == null){ // corner case2 is if last node before is deleted.
                head =null;
                return;
            }

            Node secondLast = head;
            Node lastNode =head.next;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                secondLast =secondLast.next;
            }
            secondLast.next =null;
        }

        //  retrun size

        public int getSize() {
            return size;
        }

        public void reverseIterate(){// reverse linke list
            if(head == null || head.next ==null){
                return;
            }
            Node prevNode = head;
            Node currNode = head.next;
            while(currNode!=null){
                Node nextNode =currNode.next;
                currNode.next =prevNode;

                //update
                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head =prevNode;
        }

        public static void main(String args[]){
            LLR list =new LLR();// to make linked list  we should make your own class object
            list.addlast((1));
            list.addlast((2));
            list.addlast((3));
            list.addlast((4));
            list.printList();

            list.reverseIterate();
            list.printList();

        }
    }



