package study.numberTheory;

import java.util.*;

public class exam_037 {
	
	static boolean[] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		visited = new boolean[N+1]; // false ¼¼ÆÃ
		
		visited[0] = true;
		visited[1] = true;
		
		for(int i=2;i*i<=N;i++) {
			
			if(visited[i]==true) {
				continue;
			}
			
			for(int j=i*2;j<=N;j=j+i) {
				visited[j] = true;
			}
		}
		
		for(int i=M;i<=N;i++) {
			if(!visited[i])
				System.out.println(i);
		}
		
	}
	

}
