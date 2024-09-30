class Node{
    int data;
    Node next;
    ////////doubly linked///////
    //Node prev;
    Node(int value){
        data=value;
        next=null;
    }
}
public class singlelinkedlist {
    static Node head;

    // constructor
    public singlelinkedlist(Node head){
        this.head=head;
    }

    public static void reverse(){
        Node curr=head; //1
        Node prev=null;
        Node nex;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        head=prev;
    }

    public static void  addToStart(int data){
        Node n= new Node(data);
        n.next=head;
        head=n;
    }

    public static void  addToEnd(int data){
        Node n= new Node(data);
        if(head==null){
            head=n; //if there are no other nodes in then make this the first one
        }
        else{
            Node curr=head;
            while(curr.next!=null) {
                curr = curr.next;
            }
            curr.next=n;
        }
    }

    public static void  addBefore(int data, int inbefore){
        Node n= new Node(data);
        Node curr=head;
        if(head==null){
            head=n; //if there are no other nodes in then make this the first one
        }
        else {
            while(curr!=null){
                if(curr.next.data==inbefore){
                    n.next=curr.next;
                    curr.next=n;
                    break;
                }
                curr=curr.next;
            }
        }
    }

    public static void  addAfter(int data, int prev){
        Node n= new Node(data);
        Node curr=head;
        if(head==null){
            head=n; //if there are no other nodes in then make this the first one
        }
        else {
            while(curr!=null){
                if(curr.data==prev){
                    n.next=curr.next; // make the next of the previous node the new next
                    curr.next=n;
                    break;
                }
                curr=curr.next;
            }
        }
    }

    public static void printList(){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        addToEnd(1);
        printList();
        addToEnd(2);
        printList();
        addToEnd(3);
        printList();
        addToStart(4);
        printList();

        reverse();
        printList();
    }
}
