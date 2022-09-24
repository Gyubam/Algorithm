package study.ArrayAndList;

import java.io.*;
import java.util.*;


//문제
//N개의 수 A1, A2, ..., AN과 L이 주어진다.
//
//Di = Ai-L+1 ~ Ai 중의 최솟값이라고 할 때, D에 저장된 수를 출력하는 프로그램을 작성하시오. 이때, i ≤ 0 인 Ai는 무시하고 D를 구해야 한다.
//
//입력
//첫째 줄에 N과 L이 주어진다. (1 ≤ L ≤ N ≤ 5,000,000)
//
//둘째 줄에는 N개의 수 Ai가 주어진다. (-109 ≤ Ai ≤ 109)
//
//출력
//첫째 줄에 Di를 공백으로 구분하여 순서대로 출력한다.

public class exam_010 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		Deque<Node> mydeque = new LinkedList<>();
		
		for(int i=0;i<N;i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node(now, i));
			
			if(mydeque.getFirst().index <= i - L) {
				mydeque.removeFirst();
			}
			bw.write(mydeque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
		
		

	}
	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index){
			this.value = value;
			this.index = index;
		}
	}

}
