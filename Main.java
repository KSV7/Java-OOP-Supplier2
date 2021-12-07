package com.gmail.kutepov89.sergey;

import java.util.Arrays;
import java.util.function.IntSupplier;

public class Main {

	public static void main(String[] args) {
		int[] array = { 5, 8, 2, 6, 3, 9, 7 };
		IntSupplier intsup = new GetIntNumFromArray(array);

		for (int i = 0; i < array.length; i++) {
			array[i] = intsup.getAsInt();
		}
		System.out.println(Arrays.toString(array));
	}
}
