class Solution {
    public long solution(long n) {
        return mathMethod(n);
    }
    
    private long mathMethod(long n) {
        long sqrt = (long) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        }

        return -1;
    }

    private long binarySearch(long n) {
        long left = 1;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == n) {
                return (mid + 1) * (mid + 1);
            } else if (square < n) {
                // mid가 너무 작음
                left = mid + 1;
            } else {
                // mid가 너무 큼
                right = mid - 1;
            }
        }

        // 제곱수 아님
        return -1;
    }

    private long newtonRaphsonMethod(long n) {
        if (n == 1) return 4;

        // 초기 추정값 (n/2로 시작)
        long x = n / 2;

        // 수렴할 때 까지 반복
        while (true) {
            long next = (x + n / x) / 2;

            // 더 이상 계산되지 않으면 수렴
            if (next >= x) {
                break;
            }
            x = next;
        }

        // 제곱수인지 확인
        if (x * x == n) {
            return (x + 1) * (x + 1);
        }

        return -1;
    }

    private long bitCalculation(long n) {
        if (n == 1) return 4;

        long sqrt = 0;

        // 최상위 비트부터 시작 (2^bit 형태)
        // long의 제곱근은 최대 2^31 근처이므로 bit 30부터 시작
        long bit = 1L << 30;

        while (bit > n) {
            bit >>= 1;
        }

        // 각 비트를 시도
        while (bit != 0) {
            long temp = sqrt + bit;

            if (temp * temp <= n) {
                sqrt = temp;
            }

            // 다음 비트로
            bit >>= 1;
        }

        // 제곱수 확인
        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        }

        return -1;
    }
}