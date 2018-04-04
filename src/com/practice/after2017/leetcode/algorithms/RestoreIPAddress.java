package com.practice.after2017.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/restore-ip-addresses/description/
 */
public class RestoreIPAddress {
	public List<String> restoreIpAddresses(String s) {
		List<String> result = new ArrayList<>();
		if (s.length() < 4 || s.length() > 12) {
			return result;
		}
		StringBuffer sb = new StringBuffer(s);
		int len = s.length();
		for (int i = 1; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					sb.insert(i, '.');
					sb.insert(j + 1, '.');
					sb.insert(k + 2, '.');
					// System.out.println(sb.toString());
					List<String> subnets = Arrays.asList(sb.toString().split("\\."));
					boolean isValid = true;
					for (String each : subnets) {
						if (each.length() > 3) {
							isValid = false;
							break;
						}
						int ipSec = Integer.parseInt(each);
						if (ipSec > 255 || (each.length() > 1 && each.charAt(0) == '0'))
							isValid = false;
					}
					if (isValid)
						result.add(sb.toString());

					sb = replaceDots(sb);
				}
			}
		}
		return result;
	}

	private StringBuffer replaceDots(StringBuffer sb) {
		sb.replace(sb.indexOf("."), sb.indexOf(".") + 1, "");
		sb.replace(sb.indexOf("."), sb.indexOf(".") + 1, "");
		sb.replace(sb.indexOf("."), sb.indexOf(".") + 1, "");
		return sb;
	}

	public static void main(String[] args) {
		RestoreIPAddress ria = new RestoreIPAddress();
		List<String> ipAdd = ria.restoreIpAddresses("25525511135");
		for (String each : ipAdd) {
			System.out.println(each);
		}

	}
}
