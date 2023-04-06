package cote.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

//같은 숫자는 싫어 - 스택/큐
public class Q005 {

	public static void main(String[] args) {

	}

	public static List solution01(int[] arr) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		int ex = -1;
		for(int i=0;i<arr.length;i++) {
			if(ex != arr[i]) {
				list.add(arr[i]);
			}
			ex = arr[i];
		}
		//Integer[] answer1 = list.stream().toArray(Integer[]::new);
		return list;
	}
	public static int[] solution02(int[] arr) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		int ex = -1;
		for(int i=0;i<arr.length;i++) {
			if(ex != arr[i]) {
				list.add(arr[i]);
			}
			ex = arr[i];
		}
		answer = list.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}

}
