package cote.level_1;

//약수의 개수와 덧셈
public class NumberOfDivisorAndSum {
	//left <= x <= right 
	//약수의 개수가 짝수인 수는 더하고, 홀수인 수는 뺸 수를 return;
	public static void main(String[] args) {

	}

	public static int solution01(int left, int right) {
		int answer = 0;
		
		return answer;
	}
	public static int solution02(int left, int right) {
		int answer = 0;
		int cnt = 0;
		for(int i = left; i <= right; i++) {
			for(int j = 1; j<i; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			
		}
		for(int i=1; i<left; i++) {
			if(left%i == 0) {
				cnt++;
			}
		}
		if(cnt%2 == 0) {
			answer+=left;
		}else {
			answer-=left;
		}
		
		return answer;
	}
	public static int solution03(int left, int right) {
		int answer = 0;
		
		return answer;
	}
}
