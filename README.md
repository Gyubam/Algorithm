# Algorithm
algorithm study source code storage

<br>
<br>

### 구간 합
- 합 배열 S 정의 : S[i] = A[0] + A[1] + A[2] + ... + A[i-1] + A[i]
- 합 배열 공식 : S[i] = S[i-1] + A[i]
- 구간 합 공식 : S[j] - S[i-1]
- 2차원 구간 합 배열 D[i][j] 구간 합 공식 : D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j]
- 질의 X1,Y1,X2,Y2의 대한 구간 합 : D[X2][Y2] - D[X1-1][Y2] - D[X2][Y1-1] + D[X1-1][Y1-1]
- 투포인터 : 배열 내에서 start_index 및 end_index 사용 (연속된 수의 합)
