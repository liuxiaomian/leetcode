package win.liumian.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by liumian on 16/9/2.
 */
public class T7Solution {

    public int reverse(int x) {

        if (x == 0 || Integer.MIN_VALUE + 7 > x ) {
            return 0;
        } else {
            int y = x > 0 ? x : -x;
            List<Integer> num = new LinkedList<Integer>();
            while (!(y < 10)) {
                num.add(y % 10);
                y = y / 10;
            }

            if (num.size() > 8 && num.get(0) > 2){
                return 0;
            }else {
                int n = 0;
                for (int i = 0; i < num.size(); i++) {
                    n += num.get(i);
                    if(Integer.MAX_VALUE < n * 10 || 0 > n * 10){
                        return 0;
                    }else {
                        n = n * 10;
                    }
                }
                n += y;

                return x > 0 ? n : -n;
            }
        }
    }

    public static void main(String[] args) {
        T7Solution solution = new T7Solution();
        int n = solution.reverse(1563847412);
        System.out.println(n);
        System.out.println(Integer.MAX_VALUE);

    }

}
