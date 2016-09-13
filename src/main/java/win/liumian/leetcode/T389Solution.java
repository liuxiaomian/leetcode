package win.liumian.leetcode;

/**
 * Created by liumian on 16/9/1.
 */
public class T389Solution {

    public char findTheDifference(String s, String t) {

        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            chars[t.charAt(i) - 97]--;
            if (chars[t.charAt(i) - 97] == -1) {
                return t.charAt(i);
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        T389Solution t389Solution = new T389Solution();
        String s = "abcdef";
        String t = "abcdfhe";
        char c = t389Solution.findTheDifference(s,t);
        System.out.println(c);
    }

}
