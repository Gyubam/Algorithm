package study.ArrayAndList;

import java.io.*;
import java.util.*;


//����
//N���� �� A1, A2, ..., AN�� L�� �־�����.
//
//Di = Ai-L+1 ~ Ai ���� �ּڰ��̶�� �� ��, D�� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �̶�, i �� 0 �� Ai�� �����ϰ� D�� ���ؾ� �Ѵ�.
//
//�Է�
//ù° �ٿ� N�� L�� �־�����. (1 �� L �� N �� 5,000,000)
//
//��° �ٿ��� N���� �� Ai�� �־�����. (-109 �� Ai �� 109)
//
//���
//ù° �ٿ� Di�� �������� �����Ͽ� ������� ����Ѵ�.

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
