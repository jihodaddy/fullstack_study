package tree;

public class Node {
	
	int value;
	Node leftChild;
	Node rightChild;
	
	//������: ������� �ʱ�ȭ
	public Node(int value) {
		this.value = value;
		leftChild = null; // ��ü�̹Ƿ� null������ �ʱ�ȭ
		rightChild = null;
	}
		
}
