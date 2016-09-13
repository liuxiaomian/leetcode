package win.liumian.leetcode;

/**
 * Created by liumian on 16/9/2.
 */
public class T383Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        } else {
            int[] ransomChars = new int[26];
            int[] magazineChars = new int[26];

            for (int i = 0; i < ransomNote.length(); i++) {
                ransomChars[ransomNote.charAt(i) - 97] += 1;
            }
            for (int i = 0; i < magazine.length(); i++) {
                magazineChars[magazine.charAt(i) - 97] += 1;
            }

            for (int i = 0; i < ransomChars.length; i++) {
                if (ransomChars[i] > magazineChars[i]) {
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        T383Solution solution = new T383Solution();
        boolean result = solution.canConstruct("", "ab");
        System.out.println(result);
    }

}
