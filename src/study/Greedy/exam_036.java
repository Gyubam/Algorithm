package study.Greedy;

import java.util.*;

public class exam_036 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String example = sc.nextLine();
		
		String[] s_arr = example.split("-");

		int total = 0;
		
		String[] firstArr = s_arr[0].split("\\+");
		
		for(int i=0;i<firstArr.length;i++) {
			total = total + Integer.parseInt(firstArr[i]);
		}
		
		for(int i=1;i<s_arr.length;i++) {
			
			int sum = 0;
			
			String[] s_arr2 = s_arr[i].split("\\+");
			for(String s : s_arr2) {
				sum = sum + Integer.parseInt(s);
			}
			total = total - sum;
		}
		
		System.out.print(total);
	}

}
