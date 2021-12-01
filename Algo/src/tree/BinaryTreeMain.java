package tree;

//���� ����
public class BinaryTreeMain {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insertNode(5);
		tree.insertNode(2);
		tree.insertNode(8);
		tree.insertNode(1);
		tree.insertNode(4);
		tree.insertNode(6);
		tree.insertNode(9);
		tree.insertNode(3);
		tree.insertNode(7);

		tree.preorderTree(tree.rootNode, 0);
		System.out.println();
		
		tree.inorderTree(tree.rootNode, 0);
		System.out.println();
		
		tree.postorderTree(tree.rootNode, 0);
		System.out.println();
		
		//���� Ʈ�� �˻�
		tree.searchBTree(tree.rootNode, 7);
		//Ÿ���� 5���� ŭ
		//Ÿ���� 8���� ����
		//Ÿ���� 6���� ŭ
		//ã����
		System.out.println();
		tree.searchBTree(tree.rootNode, 10);
		//Ÿ���� 5���� ŭ
		//Ÿ���� 8���� ŭ
		//Ÿ���� 9���� ŭ
		//Ʈ���� ����
		
	}

}