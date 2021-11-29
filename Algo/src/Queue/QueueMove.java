package Queue;

/*
 ť(queue) ����1 
  ���� ����µ��� �����÷ο� �߻�: �̵�����
  */

public class QueueMove {
	// �������
		private int queueSize; 	// ť�� �뷮
		private int front;		// ���� ������. ù��° ��Ҿ�
		private int rear; 		// ���� ������. ������ ��Ұ��� ����
		private int num;		// ���� ������ ��
		private char[] queue;	// ť ��ü(���� ����, ���� �Ҵ� �� �޾���)
		
		
	// �����ڿ��� �ʱ�ȭ
		public QueueMove(int queueSize) {
			//�迭�� ����ϹǷ� �ʱⰪ -1�� ����
			front = rear = -1;				// ť�� ��� �ִ� ����
			num = 0;						// ������ ��
			this.queueSize = queueSize;		//ť ũ�� ����
			queue = new char[queueSize];	// ť ����
			
		}
	// ť�� ����ִ� ���� Ȯ���ϴ� isEmpty()
		// true / false
		public boolean isEmpty() {
			//front�� rear �����Ͱ� ������ ť�� ����ִ� ����
			// �����Ͱ� �����Ƿ� �����͸� ��� -1�� �ʱ�ȭ
			// �迭 ����ϹǷ� ù ��°�� 0, ù��° ������ -1
			if(front == rear) {
				front = rear = -1;
			}
			// front �� rear �����Ͱ� ������� true, �ƴϸ� false return
			return front == rear;
		}
	
	// ť�� ���� ���ִ� ���� Ȯ���ϴ� isFull()
		public boolean isFull() {
			//rear�����Ͱ� ť�� ������ index�� �����ϰ�
			// ������ ���� queueSize�� �����ϸ� Full����
			return (rear == queueSize -1 && num == queueSize);
			
			
		}
	
	// ť�� ������ �����ϴ� enqueue()
	// (1) Full���� Ȯ��
	// (2) ������ ����
		public void enqueue(char item) {
			if(isFull()) {
			System.out.println("Queue Full");
			}else if(num != 0 && rear == queueSize -1){
				// rear�� ������ �ε����� ����������
				// �����Ͱ� 1���� ����ִ� ���
				// queue �̵� : ���� queue�� �����ؼ� 
				// ���� �ε��� 0 ���� ���� ��
				//System.arraycopy(�ҽ�, �����ε���, ���, �����ε���, ����);
				System.arraycopy(queue, front+1, queue, 0, queue.length - 1);
				System.out.println("ť �̵� �߻�");
				rear--;
				front = -1;
				
				queue[++rear] = item;   // rear ���� ��ġ�� ������ ����
				num++;					
			}else {
				queue[++rear] = item;   // rear ���� ��ġ�� ������ ����
				num++;					// ������ �� ����
			}
		}
	// ť���� ������ �����ϴ� dequeue()
	// (1) Empty ���� Ȯ��
	// (2) ������ ����(������ ������ ��ȯ)
		public char dequeue() {
			if(isEmpty()) {
				return 'E';
			}else {
				num--; 		//������ �� ����
				front++; 	// front ����(front ���� ��ġ �� ����)
				return queue[front];
			}
		}
	// ť�� ù ��° ������ �����ϴ� peek()
		public char peek() {
			if(isEmpty()) {
				System.out.println("peek ����. Empty");
				return 'E';
			}else {
				return queue[front + 1];
			}
		}
	
	// ť �ʱ�ȭ �ϴ� clear()
		public void clear() {
			front = rear = -1;
			System.out.println("clear!");
		}
	// ť�� ����ִ� ��� �����͸� ����ϴ� showQueue()
	// (1) ť�� ������� Ȯ��
	// (2) ť�� �ִ� ��� ������ ���
		public void showQueue() {
			if(isEmpty()) {
				System.out.println("Queue Empty");
			}else {
				System.out.print("Queue item : ");
				//front +1 ��ġ���� rear���� ���
				for(int i=front+1; i<rear; i++) {
					System.out.print(i+ ":" + queue[i]+" ");
					
				}
			}
		}
	// ������ ������ ��ȯ�ϴ� numOf
		public int numOfData() {
			return num;
		}

}
