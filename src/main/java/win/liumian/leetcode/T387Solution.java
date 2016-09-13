package win.liumian.leetcode;

/**
 * Created by liumian on 16/9/1.
 */
public class T387Solution {

    public int firstUniqChar(String s) {

        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 97] != 0) {
                chars[s.charAt(i) - 97] += s.length();
            } else {
                chars[s.charAt(i) - 97] = 1;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(chars[s.charAt(i) - 97] < s.length()){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        T387Solution t387Solution = new T387Solution();
        int index = t387Solution.firstUniqChar("loveleetcode");
    }

}
