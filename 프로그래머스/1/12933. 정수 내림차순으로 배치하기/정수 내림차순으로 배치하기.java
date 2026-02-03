import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
//         long arraySortResult = arraySort(n);
//         System.out.println("arraySortResult = " + arraySortResult);

//         long streamSortResult = streamSort(n);
//         System.out.println("streamSortResult = " + streamSortResult);

//         long bubbleSortResult = bubbleSort(n);
//         System.out.println("bubbleSortResult = " + bubbleSortResult);

//         long selectionSortResult = selectionSort(n);
//         System.out.println("selectionSortResult = " + selectionSortResult);

//         long mergeSortResult = mergeSort(n);
//         System.out.println("mergeSortResult = " + mergeSortResult);

//         long countingSortResult = countingSort(n);
//         System.out.println("countingSortResult = " + countingSortResult);
        
        return Long.parseLong(
                String.valueOf(n)
                        .chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining())
        );
    }
    
    private long arraySort(long n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuffer sb = new StringBuffer(new String(chars));
        sb.reverse();
        return Long.parseLong(sb.toString());
    }

    private long streamSort(long n) {
        return Long.parseLong(
                String.valueOf(n)
                        .chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining())
        );
    }


    private int[] getDigits(long n) {
        long temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;
        while (n > 0) {
            digits[index++] = (int)(n % 10);
            n /= 10;
        }

        return digits;
    }

    private long digitsToLong(int[] digits) {
        long answer = 0;
        for (int i = 0; i < digits.length; i++) {
            answer = answer * 10 + digits[i];
        }

        return answer;
    }

    private long bubbleSort(long n) {
        int[] digits = getDigits(n);

        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = 0; j < digits.length - 1; j++) {
                if (digits[j] < digits[j + 1]) {
                    int temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
        }

        return digitsToLong(digits);
    }

    private long selectionSort(long n) {
        int[] digits = getDigits(n);

        for (int i = 0; i < digits.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[j] > digits[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = digits[i];
            digits[i] = digits[maxIndex];
            digits[maxIndex] = temp;
        }

        return digitsToLong(digits);
    }

    private long mergeSort(long n) {
        int[] digits = getDigits(n);

        mergeSort(digits, 0, digits.length - 1);

        return digitsToLong(digits);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++) {
            l[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            r[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2) {
            if (l[i] >= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }

        while (i < n1) {
            arr[k++] = l[i++];
        }

        while (j < n2) {
            arr[k++] = r[j++];
        }
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                if (arr[j] >= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    private long countingSort(long n) {
        int[] count = new int[10];

        while (n > 0) {
            count[(int) (n % 10)]++;
            n /= 10;
        }

        long answer = 0;
        for (int i = 9; i >= 0; i--) {
            for(int j = 0; j < count[i]; j++) {
                answer = answer * 10 + i;
            }
        }

        return answer;
    }
}