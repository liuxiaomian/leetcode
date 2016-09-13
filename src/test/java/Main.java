import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int m, s, t;
        Scanner cin = new Scanner(System.in);
        m = cin.nextInt();
        s = cin.nextInt();
        t = cin.nextInt();
        Main test = new Main();
        test.start(m, s, t);
    }

    public void start(int m, int s, int t) {
        int l = s;

        int second = 0;
        while (s > 0) {

            //如果魔法大于10 就使用魔法
            while (m >= 10) {
                second++;
                if (second > t) {
                    System.out.println("No " + (l - s));
                    return;
                }
                m -= 10;
                s -= 60;
                if (s <= 0) {
                    System.out.println("Yes " + second);
                    return;
                }
            }
            //跑
            if (s >= 60 && s <= 68) {
                second += 4;
                if (second > t) {
                    System.out.println("No " + (l - s));
                    return;
                }
                s -= 17 * 4;
            } else if (s <= 34) {
                second++;
                if (second > t) {
                    System.out.println("No " + (l - s));
                    return;
                }
                s -= 17;
            } else {
                //休息
                int tem = 0;
                while (m < 10) {
                    second++;

                    //尝试跑
                    tem += 17;
                    if (second >= t) {
                        System.out.println("No " + ((l - s) + tem));
                        return;
                    }
                    if (tem > s){
                        System.out.println("Yes " + second);
                        return;
                    }
                    m += 4;
                }
            }
        }
        System.out.println("Yes " + second);
    }

}
