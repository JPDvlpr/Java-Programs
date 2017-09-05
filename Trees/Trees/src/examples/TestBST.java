package examples;

public class TestBST
{

	public static void main(String[] args)
	{
		//create a search tree
		BinarySearchTree<String> lettersBST = new BinarySearchTree<>();
		
		//add a few elements
		lettersBST.add("M");
		lettersBST.add("F");
		lettersBST.add("B");
		lettersBST.add("K");
		lettersBST.add("J");
		lettersBST.add("D");
		lettersBST.add("B");
		lettersBST.add("F");
		lettersBST.add("G");
		lettersBST.add("T");
		lettersBST.add("Q");

		//test our tree traversal
		lettersBST.inOrder();
	}

}
