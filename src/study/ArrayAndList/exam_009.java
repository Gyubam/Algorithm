package study.ArrayAndList;

import java.io.*;
import java.util.*;

//����
//��ҿ� ���ڿ��� ������ ��� ���� �����ϴ� ��ȣ�� DNA ���ڿ��� �˰� �Ǿ���. DNA ���ڿ��� ��� ���ڿ��� �����ϴ� ���ڰ� {��A��, ��C��, ��G��, ��T��} �� ���ڿ��� ���Ѵ�. ���� ��� ��ACKA���� DNA ���ڿ��� �ƴ����� ��ACCA���� DNA ���ڿ��̴�. �̷� �ź��� ���ڿ��� ������ �ŷ�� ��ȣ�� ������ DNA ���ڿ��� ����� ������� DNA ���ڿ��� �κй��ڿ��� ��й�ȣ�� ����ϱ�� �����Ծ���.
//
//������ ��ȣ�� �̷��� ������� ū ������ �ִٴ� ���� �߰��ߴ�. ������ DNA ���ڿ��� �κй��ڿ��� �̾��� �� ��AAAA���� ���� ���ȿ� ����� ��й�ȣ�� ����� �� �� �ֱ� �����̴�. �׷��� ��ȣ�� �κй��ڿ����� �����ϴ� ������ ������ Ư�� ���� �̻��̿��� ��й�ȣ�� ����� �� �ִٴ� ��Ģ�� �������.
//
//������ DNA���ڿ��� ��AAACCTGCCAA�� �̰� ��ȣ�� ���� �κй��ڿ��� ���̸� 4��� ����. �׸��� �κй��ڿ��� ��A�� �� 1�� �̻�, ��C���� 1�� �̻�, ��G���� 1�� �̻�, ��T���� 0�� �̻��� �����ؾ� ��й�ȣ�� ����� �� �ִٰ� ����. �̶� ��ACCT�� �� ��G�� �� 1 �� �̻� �����ؾ� �Ѵٴ� ������ �������� ���� ��й�ȣ�� ������� ���Ѵ�. ������ ��GCCA�� �� ��� ������ �����ϱ� ������ ��й�ȣ�� ����� �� �ִ�.
//
//��ȣ�� ���� ������ DNA ���ڿ��� ��й�ȣ�� ����� �κк��ڿ��� ����, �׸��� {��A��, ��C��, ��G��, ��T��} �� ���� ��� �̻� �����ؾ� ��й�ȣ�� ����� �� �ִ��� ������� �־����� �� ��ȣ�� ���� �� �ִ� ��й�ȣ�� ������ ���� ���ϴ� ���α׷��� �ۼ�����. �� �κй��ڿ��� �����ϴ� ��ġ�� �ٸ��ٸ� �κй��ڿ��� ���ٰ� �ϴ��� �ٸ� ���ڿ��� ����Ѵ�.
//
//�Է�
//ù ��° �ٿ� ��ȣ�� ���Ƿ� ���� DNA ���ڿ� ���� |S|�� ��й�ȣ�� ����� �κй��ڿ��� ���� |P| �� �־�����. (1 �� |P| �� |S| �� 1,000,000)
//
//�ι� ° �ٿ��� ��ȣ�� ���Ƿ� ���� DNA ���ڿ��� �־�����.
//
//���� ° �ٿ��� �κй��ڿ��� ���ԵǾ�� �� {��A��, ��C��, ��G��, ��T��} �� �ּ� ������ ������ �������� �־�����. ������ ���� |S| ���� �۰ų� ���� ���� �ƴ� �����̸� �� ���� |S| ���� �۰ų� ������ ����ȴ�.
//
//���
//ù ��° �ٿ� ��ȣ�� ���� �� �ִ� ��й�ȣ�� ������ ���� ����ض�.

public class exam_009 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int sLength = Integer.parseInt(st.nextToken()); // 9
		int subsetLength= Integer.parseInt(st.nextToken()); // 8
		int result = 0;
		
		st = new StringTokenizer(br.readLine());
		
		
		char[] cArray = st.nextToken().toCharArray();
		
		st = new StringTokenizer(br.readLine());
		//ACGT
		int[] check = new int[4];
		int[] value = new int[4];
		
		for(int i=0;i<4;i++) {
			check[i] = Integer.parseInt(st.nextToken());
		}
		
		int start_index = 0;
		int end_index = subsetLength-1; // 7
		
		// �ʱ� ���� �迭 ����
		for(int k=start_index;k<=end_index;k++) {
			if(cArray[k] == 'A') {
				value[0]++;
			}else if(cArray[k] == 'C') {
				value[1]++;
			}else if(cArray[k] == 'G') {
				value[2]++;
			}else if(cArray[k] == 'T') {
				value[3]++;
			}
		}
		
		while(end_index <= sLength - 1) { // 8
			
			
			if(value[0]>=check[0] && value[1]>=check[1] && 
					value[2]>=check[2] && value[3]>=check[3]) {
				result++;
			}
			
			if(cArray[start_index] == 'A') {
				value[0]--;
			}else if(cArray[start_index] == 'C') {
				value[1]--;
			}else if(cArray[start_index] == 'G') {
				value[2]--;
			}else if(cArray[start_index] == 'T') {
				value[3]--;
			}
			
			start_index++;
			end_index++;
			
			if(end_index >= sLength) {
				break;
			}
			
			if(cArray[end_index] == 'A') {
				value[0]++;
			}else if(cArray[end_index] == 'C') {
				value[1]++;
			}else if(cArray[end_index] == 'G') {
				value[2]++;
			}else if(cArray[end_index] == 'T') {
				value[3]++;
			}
		}
		
		System.out.println(result);
	}

}
