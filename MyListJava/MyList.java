
public class MyList<Item> {
    private Node<Item> head;    
    
    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty queue.
     */
    public MyList() {
        head = null;
        
    }

   
    public void insert_item(Item item) {        
        Node n = new Node<Item>();
        n.item = item;
        n.next = null;
        if(this.head == null){
            this.head = n;
        }else{
            Node last = this.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = n;
        }
        // insert code
    }
    public int remove_item(Item item) {
       return -1;
    }

    public int search_item(Item item){
       return -1; 
    }

    public void imprime(){
        while(head.next != null){
            System.out.println(head.item);
        }
    }
}
