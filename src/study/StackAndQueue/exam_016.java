package study.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//����
//���� ��Ʈ �˰����� ������ ���� C++�� �ۼ��ߴ�.
//
//bool changed = false;
//for (int i=1; i<=N+1; i++) {
//    changed = false;
//    for (int j=1; j<=N-i; j++) {
//        if (A[j] > A[j+1]) {
//            changed = true;
//            swap(A[j], A[j+1]);
//        }
//    }
//    if (changed == false) {
//        cout << i << '\n';
//        break;
//    }
//}
//�� �ҽ����� N�� �迭�� ũ���̰�, A�� �����ؾ� �ϴ� �迭�̴�. �迭�� A[1]���� ����Ѵ�.
//
//���� ���� �ҽ��� ��������� ��, � ���� ��µǴ��� ���غ���.
//
//�Է�
//ù° �ٿ� N�� �־�����. N�� 500,000���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ� A[1]���� A[N]���� �ϳ��� �־�����. A�� ����ִ� ���� 1,000,000���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
//
//���
//������ ����Ѵ�.

public class exam_016 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		mData[] A = new mData[N];
		for(int i=0;i<N;i++) {
			A[i] = new mData(Integer.parseInt(reader.readLine()), i);
		}
		Arrays.sort(A);
		int Max = 0;
		for(int i=0;i<N;i++) {
			if(Max < A[i].index - i)
				Max = A[i].index - i;
		}
		System.out.println(Max+1);
	}

}

class mData implements Comparable<mData> {
	int value;
	int index;
	
	public mData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(mData o) {
		return this.value - o.value;
	}
}
