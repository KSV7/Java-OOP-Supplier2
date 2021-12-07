package com.gmail.kutepov89.sergey;

import java.util.Arrays;
import java.util.function.IntSupplier;

public class GetIntNumFromArray implements IntSupplier {
	private int[] ar;

	public GetIntNumFromArray(int[] ar) {
		super();
		this.ar = ar;
	}

	public int[] getAr() {
		return ar;
	}

	public void setAr(int[] ar) {
		this.ar = ar;
	}

	@Override
	public String toString() {
		return "GetIntNumFromArray [ar=" + Arrays.toString(ar) + "]";
	}

	@Override
	public int getAsInt() {
		for (int i : ar) {
			ar = Arrays.copyOfRange(ar, 1, ar.length);
			return i;
		}
		return 0;
	}

}
