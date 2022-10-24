package study.bfsAndDfs;

import java.util.*;

//����
//BOJ �˰��� ķ������ �� N���� �����ϰ� �ִ�. ������� 0������ N-1������ ��ȣ�� �Ű��� �ְ�, �Ϻ� ������� ģ���̴�.
//
//������ ������ ���� ģ�� ���踦 ���� ��� A, B, C, D, E�� �����ϴ��� ���غ����� �Ѵ�.
//
//A�� B�� ģ����.
//B�� C�� ģ����.
//C�� D�� ģ����.
//D�� E�� ģ����.
//���� ���� ģ�� ���谡 �����ϴ��� ���ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ����� �� N (5 �� N �� 2000)�� ģ�� ������ �� M (1 �� M �� 2000)�� �־�����.
//
//��° �ٺ��� M���� �ٿ��� ���� a�� b�� �־�����, a�� b�� ģ����� ���̴�. (0 �� a, b �� N-1, a �� b) ���� ģ�� ���谡 �� �� �̻� �־����� ���� ����.
//
//���
//������ ���ǿ� �´� A, B, C, D, E�� �����ϸ� 1�� ������ 0�� ����Ѵ�.

public class exam_025 {
	
	static boolean visited[];
	static ArrayList<Integer>[] A;
	static boolean arrive;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arrive = false;
		
		A = new ArrayList[N];
		visited = new boolean[N];
		
		for(int i=0;i<N;i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<M;i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E);
			A[E].add(S);
		}
		for(int i=0;i<N;i++) {
			DFS(i,1);
			if(arrive)
				break;
		}
		if(arrive)
			System.out.println("1");
		else
			System.out.println("0");
		
	}
	
	public static void DFS(int now, int depth) {
		if(depth==5 || arrive) {
			arrive=true;
			return;
		}
		visited[now] = true;
		for(int i : A[now]) {
			if(!visited[i]) {
				DFS(i, depth+1);
			}
		}
		visited[now] = false;
	}

}
