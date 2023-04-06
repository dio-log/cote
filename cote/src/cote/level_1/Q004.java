package cote.level_1;

//부족한 금액 계산하기
public class Q004 {

	public static void main(String[] args) {
		
	}

	public static long solution01(int price, int money, int count) {
		long answer = -1;
		long sum = 0;
		for(int i=0; i<count; i++) {
			sum += price*(i+1);
		}
		answer = price - sum;
		return answer < 0 ? - answer : 0;
	}
	
	public static long solution02(long price, long money, long count) {
		return Math.max(price * (count + 1) * count / 2 - money, 0);
	}

}
