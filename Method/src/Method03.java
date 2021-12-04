import java.util.*;

class Ex03{

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
	// 예 1) 87, 11, 92, 14, 47

	void setRandomValuesinArray(int [] scores) {
		for(int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));
	}

	// 문제2) 전교생의 총점과 평균 출력하는 메서드
	// 예 2) 총점(251) 평균(50.2)
	void printSumAndAverage (int [] scores) {
		int total = 0;
		float avg = 0;
		for(int i = 0; i < scores.length; i++ ) {
			total += scores[i];
		}
		avg = total / (float)scores.length;
		System.out.printf("총점(%d) 평균(%.2f)\n", total, avg);
	}
	
	// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
	// 예 3) 2명
	void printWinner (int [] scores) {
		int cnt = 0;
		for(int i =0; i< scores.length; i++) {
			if(scores[i] >= 60) { cnt++;}
		}
		System.out.printf("합격자수: %d\n", cnt);
	}

	// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
	// 정답4) 인덱스 입력 : 1 성적 : 11점
	void printScore1 (int [] scores) {
		System.out.print("인덱스: ");
		int n = scan.nextInt();
		System.out.println(scores[n]);
	}

	// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
	// 정답5) 성적 입력 : 11 인덱스 : 1
	void printScore2 (int [] scores) {
		System.out.print("성적입력: ");
		int s = scan.nextInt();
		for(int i = 0; i < scores.length; i ++) {
			if(scores[i] == s) {
				System.out.println(i);
			}
		}
	}

	// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	// 단, 없는학번 입력 시 예외처리
	// 정답6) 학번 입력 : 1003 성적 : 45점
	
	void printScore3(int [] hakbuns, int [] scores) {
		System.out.print("학번 입력: ");
		int hak = scan.nextInt();
			boolean flag = true;
			for(int i = 0; i < hakbuns.length; i++) {
				if(hakbuns[i]==hak) {
					System.out.printf("성적: %d\n", scores[i]);
					flag = false;
					}
			}
			if(flag) {System.out.println("해당 학번이 존재하지 않습니다.");}
	}
	
	// 문제7) 1등학생의 학번과 성적 출력하는 메서드
	// 정답7) 1004번(98점)

	void printNumberOne (int [] hakbuns, int [] scores) {
		int maxhakbun = 0;
		int maxscore = 0;
		for(int i = 0; i< scores.length; i++) {
			if(scores[i]>maxscore) {
				maxscore = scores[i];
				maxhakbun = hakbuns[i];
			}
		}
		System.out.printf("%d번 ( %d점 )\n", maxhakbun, maxscore);
	}
}	
	public class Method03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex03 e = new Ex03();
		
		e.setRandomValuesinArray(scores);
		e.printSumAndAverage(scores);
		e.printWinner(scores);
//		e.printScore2(scores);
//		e.printScore3(hakbuns, scores);
		e.printNumberOne(hakbuns, scores);
		
	}

}
