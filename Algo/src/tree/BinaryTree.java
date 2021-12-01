package tree;

public class BinaryTree {
	Node rootNode = null;
	
	//새로운 노드 삽입
	public void insertNode(int element) {
		// 루트가 빈 경우, 즉, 아무노드도 없으면 노드 생성
		if(rootNode == null) {
			rootNode = new Node(element);			
		}else {
			Node head = rootNode;
			Node currentNode;
			
			while(true) {
				currentNode = head;
				
				//탐색 시작
				// 현재 루트보다 작은경우, 왼쪽으로 탐색
				if(head.value > element) {
					head = head.leftChild;
					
					// 왼쪽 자식 노드가 비어 있는 경우, 해당 위치에 추가할 노드 삽입
					// 현재 currentNod는 head를 가리키고 있음
					if(head == null) {
						currentNode.leftChild = new Node(element);
						break;
					}
				}else { // 현재 루트보다 큰경우, 오른쪽으로 탐색
					head = head.rightChild;
					
					// 오른쪽 자식 노드가 비어있는 경우, 해당 위치에 추가할 노드 삽입
					// 현재 currentNod는 head를 가리키고 있음
					if(head == null) {
						currentNode.rightChild = new Node(element);
						break;
					}
				}
			} // while 종료
		}
	}

	//전위 운행(순회): root - left - right
	public void preorderTree(Node root, int depth) {
		if(root != null) {
			for(int i=0; i<depth; i++) {
				System.out.print("ㄴ");
			}
			
			System.out.println(root.value); 		 // root
			preorderTree(root.leftChild, depth+1);   // left
			preorderTree(root.rightChild, depth+1);  // right
		}
	}
	//중위 운행(순회): left - root - right
	public void inorderTree(Node root, int depth) {
		if(root != null) {
			inorderTree(root.leftChild, depth+1);   // left
			
			for(int i=0; i<depth; i++) {
				System.out.print("ㄴ");
			}
			
			System.out.println(root.value); 		// root
			
			inorderTree(root.rightChild, depth+1);  // right
		}
	}
	//후위 운행(순회): left = right - root
	public void postorderTree(Node root, int depth) {
		if(root != null) {
			postorderTree(root.leftChild, depth+1);  // left
			postorderTree(root.rightChild, depth+1); // right
			
			for(int i=0; i<depth; i++) {
				System.out.print("ㄴ");
			}
			
			System.out.println(root.value); 		 // root
			
			
		}
	}
	
	// 이진 검색
	public void searchBTree(Node n, int target) {
		try {
			// target 값이 현재 노드의 데이터 (value)보다 작은지 비교
			if(target < n.value) {
				System.out.println("타깃이 "+ n.value+ "보다 작음");
				searchBTree(n.leftChild, target);
			}else if(target > n.value) {
				System.out.println("타깃이 "+ n.value+ "보다 큼");
				searchBTree(n.rightChild, target);
			}else {
				System.out.println("찾았음");
			}
		} catch (Exception e) {
			System.out.println("트리에 없음");
		}
		
	}
	
}
