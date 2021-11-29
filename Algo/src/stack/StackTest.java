package stack;

import java.util.Stack;

// java.util.Stack; Å¬·¡½º »ç¿ë

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Stack<String> stk = new Stack<String>();
			
			stk.push("È«±æµ¿");
			stk.push("ÀÌ¸ù·æ");
			stk.push("¼ºÃáÇâ");
			
			for(int i=0; i<stk.size(); i++) {
				System.out.println(i + ":" + stk.get(i));
			}
				// 0:È«±æµ¿
				// 1:ÀÌ¸ù·æ
				// 2:¼ºÃáÇâ
			
			System.out.println("½ºÅÃ Å©±â: " + stk.size());
			System.out.println("ÃÖ»óÀ§ °ª : "+ stk.peek());
			System.out.println("ÀÌ¸ù·æ µé¾îÀÖ³ª? : " + stk.contains("ÀÌ¸ù·æ"));
			System.out.println("pop ¼öÇà: " + stk.pop());
			System.out.println("pop ¼öÇà: " + stk.pop());
			
			for(int i=0; i<stk.size(); i++) {
				System.out.println(i + ":" + stk.get(i));
			}
			System.out.println("clear ¼öÇà");
			stk.clear();
			
			System.out.println("empty? : " + stk.empty());

			System.out.println("pop ¼öÇà" + stk.pop());
			// ¿À·ù: java.util.EmptyStackException
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
