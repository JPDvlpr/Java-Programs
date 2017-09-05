package examples;

public class BinarySearchTree<T extends Comparable<T>>
{
	private Node root;

	public BinarySearchTree()
	{
		// do nothing
	}

	public boolean add(T element)
	{
		// empty tree
		if (root == null)
		{
			root = new Node(element);
			return true;
		} else
		{
			// we need to search for a spot in th tree
			return add(root, element); // start the search at the root
		}
	}

	private boolean add(Node current, T element)
	{
		int compare = current.data.compareTo(element);

		// are the object equal
		if (compare == 0)
		{
			return false; // no duplicates
		} else if (compare < 0)
		{
			// search to the right
			if (current.right == null)
			{
				current.right = new Node(element);
				return true;
			} else
			{
				return add(current.right, element);
			}
		} 
		else // if (compare > 0)
		{
			if (current.left == null)
			{
				current.left = new Node(element);
				return true;
			} else
			{
				return add(current.left, element);
			}
		}
		// search to the left

	}

	public void inOrder()
	{
		// start our traversal at the root
		inOrder(root);
	}

	private void inOrder(Node current)
	{
		// double check that current is not null
		if (current != null)
		{
			//change order ctrl X,V to in order(LNR), post order(LRN), pre-order(NLRh)
			inOrder(current.left);
			System.out.println(current.data);
			inOrder(current.right);
		}
	}

	private class Node
	{

		private T data;
		private Node left;
		private Node right;

		public Node(T data)
		{
			this.data = data;
		}

		public String toString()
		{
			String leftData = (left == null) ? "null" : left.data.toString();
			String rightData = (right == null) ? "null" : right.data.toString();

			return leftData + " <-- " + data + " --> " + rightData;
		}
	}
}
