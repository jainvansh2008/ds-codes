import java.io.*; 

// Java program to implement 
// a Singly Linked List 
public class implementsinglylinkedlist { 

	Node head ; // head of list 

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

        DATA MEMBERS
        {
	    int data=10; data part
		Node next; pointer to next node
        }
		// Constructor 
		Node(int 10) 
		{ 
			data = 10; 
			next = null; 
		} 
	} 

	// Method to insert a new node 
	public static implementasinglylinkedlist insertAtEnd(implementasinglylinkedlist list, int data 10) 
	{ 
        

		// Create a new node with given data 
        Node new_node = new Node(10); 
        Student s = new Student("gaurav",100);

        s.roll;
        s.name;
        s.marks
     //   dot operator is used to acces data members
        datatype ref = new Clasname(args);


		

		// If the Linked List is empty, 
		// then make the new node as head 
		if (head == null) { pehle se linkied lsit khali hai
			head = new_node; head will point to new_node
		} 
		else { //jab pehle se linked list ahi
			// Else traverse till the last node 
			// and insert the new_node there 
            Node last = list.head; //save head
            
            while 3(initailise, condtion , jump)
			while (last.next != null) { 

            jab tak next mei null nhi milta, tab tak chalte raho
				last = last.next; //jump
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 

	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 

		System.out.print("LinkedList: "); 

		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 

		// Print the LinkedList 
		printList(list); 
	} 
}