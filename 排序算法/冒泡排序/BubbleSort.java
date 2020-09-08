/*
 * @Author: Goog Tech
 * @Date: 2020-09-08 17:25:06
 * @LastEditTime: 2020-09-08 20:49:26
 * @Description: bubble sort
 * @FilePath: \leetcode-googtech\排序算法\冒泡排序\BubbleSort.java
 * @WebSite: https://algorithm.show/
 */
public class BubbleSort {

	// Bubble Sort
	private void bubbleSort(int A[]) {
		for (int pass = A.length - 1; pass >= 0; pass--) {
			for (int i = 0; i < pass; i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
			}
		}
	}

	// Bubble Sort be Improved
	private void bubbleSortImproved(int A[]) {
		boolean swapped = true;
		for (int pass = A.length - 1; pass >= 0 && swapped; pass--) {
			swapped = false;
			for (int i = 0; i < pass; i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	// Test
	public static void main(String[] args) {
		int[] array = { 4, 1, 2, 7, 2, 6, 1, 9, 9, 8 };
		new BubbleSort().bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
	}

	// Output
	// 1	1	2	2	4	6	7	8	9	9
}
