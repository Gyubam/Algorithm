package study.Graph;

import java.io.*;
import java.util.*;

public class exam_054 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		
		for(int i=0;i<=N;i++) {
			A.add(new ArrayList<>());
		}
		int[] indegree = new int[N+1];
		int[] selfBuild = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			selfBuild[i] = Integer.parseInt(st.nextToken());
			
			while(true) {
				int preTemp = Integer.parseInt(st.nextToken());
				if(preTemp == -1) {
					break;
				}
				A.get(preTemp).add(i);
				indegree[i]++;
			}
		}
		
		//위상 정렬
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			if(indegree[i] == 0) {
				queue.offer(i);
			}
		}
		int[] result = new int[N+1];
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(int next : A.get(now)) {
				indegree[next]--;
				//시간 업데이트
				result[next] = Math.max(result[next], result[now] + selfBuild[now]);
				if(indegree[next]==0) {
					queue.offer(next);
				}
			}
		}
		for(int i=1;i<=N;i++) {
			System.out.println(result[i] + selfBuild[i]);
		}
		
		
	}

}
