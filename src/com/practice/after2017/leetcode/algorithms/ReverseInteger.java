package com.practice.after2017.leetcode.algorithms;

public class ReverseInteger {

	public int reverseII(int x) {
		int result = 0;

		while (x != 0) {
			int unit = x % 10;
			int resultTemp = result * 10 + unit;
			if ((resultTemp - unit) / 10 != result)
				return 0;

			result = resultTemp;
			x = x / 10;
		}

		return result;
	}

	public int reverse(int x) {
		if (x / 10 == 0)
			return x;
		String num = new Integer(x).toString();
		int sign = num.charAt(0) == '-' ? -1 : 1;
		if (sign == -1) {
			num = num.substring(1);
		}
		num = reversed(num);
		Long longNum = Long.parseLong(num);
		if (longNum > Integer.MAX_VALUE) {
			return 0;
		} else {
			Integer intNum = Integer.parseInt(num);
			return intNum * sign;
		}
	}

	private String reversed(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
			char t = ch[i];
			ch[i] = ch[j];
			ch[j] = t;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverseII(Integer.MAX_VALUE));
	}
}
