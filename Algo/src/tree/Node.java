package tree;

public class Node {
	
	int value;
	Node leftChild;
	Node rightChild;
	
	//생성자: 멘버변수 초기화
	public Node(int value) {
		this.value = value;
		leftChild = null; // 객체이므로 null값으로 초기화
		rightChild = null;
	}
		
}
