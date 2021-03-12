

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListSortingAndMerging extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int first[] = new int[5];
		int second[] = new int[5];

		System.out.println("Enter the 5 integer elements:");
		for (int i = 0; i < 5; i++)
			first[i] = scanner.nextInt();

		System.out.println("Enter the 5 integer elements:");
		for (int i = 0; i < 5; i++)
			second[i] = scanner.nextInt();

		int[] res = sortMergedArrayList(first, second);

		for (int i = 0; i < res.length; i++)
			System.out.println(res[i]);

		scanner.close();
	}
}

class UserMainCode {

	public static int[] sortMergedArrayList(int first[], int second[]) {

		int len = first.length + second.length;
		int mergeArrays[] = new int[len];
		int resultArray[] = new int[3];

		for (int i = 0; i < len; i++) {

			if (i < first.length)
				mergeArrays[i] = first[i];
			else
				mergeArrays[i] = second[i - first.length];
		}

		// Arrays.sort(mergeArrays);

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {

				if (mergeArrays[j] > mergeArrays[j + 1]) {
					int swap = mergeArrays[j];
					mergeArrays[j] = mergeArrays[j + 1];
					mergeArrays[j + 1] = swap;
				}

			}
		}
		int count = 0;
		for (int i = 0; i < mergeArrays.length; i++)
			if (i == 2 || i == 6 || i == 8)
				resultArray[count++] = mergeArrays[i];

		return resultArray;
	}
}