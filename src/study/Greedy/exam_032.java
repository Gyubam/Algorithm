package study.Greedy;

import java.util.*;

public class exam_032 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int target = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		int count = 0;
		int index = N-1;
		
		while(target!=0) {
			if(A[index] <= target) {
				int num = target / A[index];
				count = count + num;
				target = target - num*A[index];
			}
			index--;
		}
		
		System.out.println(count);
		
	}

}
