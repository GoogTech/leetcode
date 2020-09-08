/*
 * @Author: Goog Tech
 * @Date: 2020-09-08 20:40:18
 * @LastEditTime: 2020-09-08 21:20:18
 * @Description: selection sort
 * @FilePath: \leetcode-googtech\排序算法\选择排序\SelectionSort.java
 * @WebSite: https://algorithm.show/
 */
public class InsertionSort {

	// Insertion Sort
	private void insertionSort(int A[]) {
		for (int i = 0; i < A.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[min]) {
					min = j;
				}
			}
			int temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
	}

	// Test
	public static void main(String[] args) {
		int[] array = { 4, 1, 2, 7, 2, 6, 1, 9, 9, 8 };
		new InsertionSort().insertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
	
	// Output
	// 1	1	2	2	4	6	7	8	9	9
}
