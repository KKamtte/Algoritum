class Solution {
    public int solution(int[][] sizes) {
        // 큰 값으로 우측 정렬
        for (int i = 0; i < sizes.length; i++) {
            int temp = 0;
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        int left = sizes[0][0];
        int right = sizes[0][1];

        // 최대 값을 찾아 정리
        for (int i = 1; i < sizes.length; i++) {
            if (sizes[i][0] > left) {
                left = sizes[i][0];
            }
            if (sizes[i][1] > right) {
                right = sizes[i][1];
            }
        }

        return left * right;
    }
}