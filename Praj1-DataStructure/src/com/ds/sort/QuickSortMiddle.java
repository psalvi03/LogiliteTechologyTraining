//Quick Sort

package com.ds.sort;

public class QuickSortMiddle {

	public static void main(String[] args) {
		int[] arr = { 48, 2, 5, 65, 47, 25, 15, 36, 96, 78 };
		int leng = arr.length;

		QuickSortMiddle qsm = new QuickSortMiddle();
		qsm.quickSortRecursion(arr, 0, leng - 1);
		qsm.printArr(arr);
	}

	int partition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];

		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;

			}
		}
		return low;
	}

	void quickSortRecursion(int[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			quickSortRecursion(arr, low, pi - 1);
		}

		if (pi < high) {
			quickSortRecursion(arr, pi, high);
		}
	}

	void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
