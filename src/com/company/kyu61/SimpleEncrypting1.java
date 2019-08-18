package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/57814d79a56c88e3e0000786
 */

public class SimpleEncrypting1 {

    public static String encrypt(String text, final int n) {
        StringBuilder sb;
        for (int k=0;k<n;k++) {
            sb = new StringBuilder();
            for (int i = 1; i < text.length(); i += 2) {
                sb.append(text.charAt(i));
            }
            for (int i = 0; i < text.length(); i += 2) {
                sb.append(text.charAt(i));
            }
            text = sb.toString();
        }
        return text;
    }

    public static String decrypt(String encryptedText, final int n) {
        StringBuilder sb;
        for (int k=0;k<n;k++) {
            sb = new StringBuilder();
            int border = encryptedText.length() / 2;
            for (int i = 0, j = border; i < border && j < encryptedText.length(); i++, j++) {
                sb.append(encryptedText.charAt(j));
                sb.append(encryptedText.charAt(i));
            }
            if (sb.length() != encryptedText.length()) {
                sb.append(encryptedText.charAt(encryptedText.length() - 1));
            }
            encryptedText = sb.toString();
        }
        return encryptedText;
    }

    public static void main(String[] args) {
        System.out.println(decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }
}
