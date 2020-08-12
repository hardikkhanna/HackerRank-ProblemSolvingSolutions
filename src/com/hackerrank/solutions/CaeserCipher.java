package com.hackerrank.solutions;

import java.util.Scanner;

public class CaeserCipher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		String word = s.next();
		int k = s.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; ++i) {
			sb.append(encryptChar(word.charAt(i), k));
		}

		System.out.println(sb.toString());
		s.close();
	}

	private static char encryptChar(char c, int k) {
		if (!Character.isAlphabetic(c))
			return c;
		int base = Character.isLowerCase(c) ? 'a' : 'A';
		return (char) ((c + k - base) % 26 + base);
	}

}
