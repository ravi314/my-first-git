class LinkedList { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    Node reverseUtil(Node curr, Node prev) { 
  
        if (curr.next == null) { 
            head = curr; 
            curr.next = prev; 
              
            return head; 
        } 
        Node next1 = curr.next; 
        curr.next = prev; 
  
        reverseUtil(next1, curr); 
        return head; 
    } 
	/* public int GetNth(int index) 
    { 
        Node current = head; 
        int count = 0;
        while (current != null) 
        { 
            if (count == index) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
        assert(false); 
        return 0; 
    }*/
		void printNthFromLast(int index) 
	{ 
		 Node current = head; 
        int count = 0; 


		while (current != null) 
		{ 
			 count++; 
            current = current.next;  
		} 

		current = head; 
		

	
		for (int i = 1; i < current; i++) 
			current = current.next;  

		System.out.println(current.data); 
	} 
	/* Node reverse(Node node) { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } */
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 
        list.head = new Node(25); 
        list.head.next = new Node(27); 
        list.head.next.next = new Node(30); 
        list.head.next.next.next = new Node(14); 
        list.head.next.next.next.next = new Node(57); 
        list.head.next.next.next.next.next = new Node(26); 
        list.head.next.next.next.next.next.next = new Node(70); 
        list.head.next.next.next.next.next.next.next = new Node(8); 
  
        System.out.println("Original Linked list "); 
        list.printList(head); 
        //Node res = list.reverse(head); 
		 Node res = list.reverseUtil(head, null);    
       System.out.println("Reversed linked list "); 
        list.printList(res); 
		//System.out.println("Element at index 3 is "+list.GetNth(3));
			list.printNthFromLast(6); 
    } 
} 