package tree;

//삽입 정렬
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
		
		//이진 트리 검색
		tree.searchBTree(tree.rootNode, 7);
		//타깃이 5보다 큼
		//타깃이 8보다 작음
		//타깃이 6보다 큼
		//찾았음
		System.out.println();
		tree.searchBTree(tree.rootNode, 10);
		//타깃이 5보다 큼
		//타깃이 8보다 큼
		//타깃이 9보다 큼
		//트리에 없음
		
	}

}
