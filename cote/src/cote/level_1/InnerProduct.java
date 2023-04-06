package cote.level_1;

import java.util.stream.IntStream;

//내적
public class InnerProduct {

	public static void main(String[] args) {

	}

	public static int solution01(int[] a, int[] b) {
		int answer = 0;
		for(int i=0; i<a.length; i++) {
			answer += a[i]*b[i];
		}
		return answer;
	}
	
	public static int solution02(int[] a, int[] b) {
		int answer = 0;
		for(int i=0; i<a.length; i++) {
			answer += a[i]*b[i];
		}
		return IntStream.range(0, a.length).map(idx -> a[idx]*b[idx]).sum();
	}
}
