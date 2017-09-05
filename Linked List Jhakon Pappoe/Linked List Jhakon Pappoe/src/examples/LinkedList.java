package examples;

public class LinkedList<T>
{
	// store a reference to only a few nodes (the first and maybe last)
	private Node head;
	private int size;

	public LinkedList()
	{
		// do nothing
	}

	public void add(T element)
	{
		// is the list empty
		if (head == null)
		{
			head = new Node(element, null);
		} else // not empty
		{
			Node current = head;
			while (current.next != null)
			{
				current = current.next;
			}
			size++;
			current.next = new Node(element, null);
		}
	}
	/////// print out the testlinkedlist class
	// public void printList()
	// {
	// for(int i = 0; i < )
	// }

	public boolean isEmpty()
	{
		return size == 0;
	}

	public void clear()
	{
		head = null;
	}

	public boolean remove(T element)
	{
		// empty?
		if (head == null)
		{
			return false; // not found
		} else if (head.data.equals(element)) // remove first
		{
			head = head.next;
			return true;
		} else
		{
			Node current = head;

			// continue while there is a next node and the data in the
			// next node is not equal to my search value
			while (!(current.next != null && !current.next.data.equals(element)))
			{
				current = current.next;
			}
			if (current.next == null)
			{
				return false; // not found
			} else
			{
				current.next = current.next.next;
				return true;
			}
		}
	}

	// inner class for nodes
	public class Node
	{
		private T data;
		private Node next;

		public Node(T data, Node next)
		{
			this.data = data;
			this.next = next;
		}

		public String toString()
		{
			String nextData = (next == null) ? "null" : next.data.toString();
			return data + " ----> " + nextData;
		}
	}

	public void printList()
	{
		// TODO Auto-generated method stub
		
	}
}
