package study.ArrayAndList;

//����
//N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
//test
import java.util.*;

public class exam_001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		char[] c = s.toCharArray();
		
		int answer = 0;
		
		for(int i=0;i<c.length;i++) {
			
			answer = answer + c[i] - '0';
		}
		
		System.out.print(answer);
		
	}
}
