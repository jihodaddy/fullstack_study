import java.util.*;

class TicTacToe{
	
	int[] game = new int[9];
	
	int win = 0;
	int turn = 0;
	//화면에 출력하는 기능
	
	//void printBoard();
	//void checkGame();
	//void checkBoard();
	
	void printBoard() {
		
			System.out.println(" === 틱택토 === ");
			for(int i = 0; i< game.length; i++) {
				if(game[i] == 0 ) { System.out.print("[ ]");}
				else if(game[i] == 1) {System.out.print("[O]");}
				else { System.out.print("[X]"); }
			
			if(i%3==2) { System.out.println();}	
			} //for
			
	}
	//승리체크
	int checkGame() {
		
		if (win == 1) {
			System.out.println("P[1]의 승리");
			return 1;
		} else if(win == 2) {
			System.out.println("P[2]의 승리");
			return 2;
		} else if(win == 0) {
			boolean flag = true;
			for( int i = 0; i < game.length; i++ ) {
				if (game[i] == 0) flag = false;
			}
			if (flag) {
				System.out.println("무승부");
				return 0;
			}
		}
		return -1; // 승부가 결정되지 않은 경우
		//return: 0 무승부:-1, p1승리:1, p2승리:2
		
	}
	void checkBoard() {
		//가로검사
		for(int i = 0; i < game.length; i += 3) {
			if(game[i] == 1 && game[i+1]==1 && game[i+2]==1) {
				win=1;}
			if(game[i] == 2 && game[i+1]==2 && game[i+2]==2) {
				win=2;}
			}
		//세로검사
		for(int i = 0; i < game.length; i += 3) {
			if(game[i] == 1 && game[i+1]==1 && game[i+2]==1) {
				win=1;}
			if(game[i] == 2 && game[i+1]==2 && game[i+2]==2) {
				win=2;}
			}
		// 대각선
		if(game[0] ==1 && game[4] ==1 && game[8]==1) { win=1;}
		if(game[0] ==2 && game[4] ==2 && game[8]==2) { win=2;}
		if(game[2] ==1 && game[4] ==1 && game[6]==1) { win=1;}
		if(game[2] ==2 && game[4] ==2 && game[6]==2) { win=2;}
		
		
	}
}
	

public class TicTacToeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//게임 진행(컨트롤)
		TicTacToe play = new TicTacToe();

		while(true) {
			play.printBoard();
			
			int ret = play.checkGame();
			if(ret == 1) {break;}
			else if(ret == 2) {break;}
			else if(ret == 0) {break;}
			
			if(play.turn%2==0) {
				System.out.println("[P1] 인덱스 입력: ");
				int idx = sc.nextInt();
				idx--;
				if(play.game[idx] == 0) {
					play.game[idx] =1;
						play.turn++;
				}
			}else if(play.turn%2==1) {
				System.out.println("[P2]인덱스 입력: ");
				int idx = sc.nextInt();
				
				idx--;
				if(play.game[idx] == 0) {
					play.game[idx] =2;
					play.turn++;
				}
			}
			
			play.checkBoard();
		}
	}

}
