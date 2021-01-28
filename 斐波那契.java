package chapter4;/**
 * @Classname foreach
 * @Description TODO
 * @Date 2021/1/27 17:07
 * @Created by wangxutao
 */

import javax.activation.MailcapCommandMap;
import java.util.*;

class range{
    int[] newrange(int limit,int len){
        int[] res = new int[len];
        for (int x = 0; x < len; x++) {

            res[x] = (int) ((Math.random() * limit));
        }
        return res;
    }

}
public class foreach {
    public static void main(String[] args) {
//        int[] a = new int[]{15, 256};
//        for (int x : a) {
//            System.out.println(x);
//        }
//        for (char c : "array here".toCharArray()) {
//
//            System.out.print(c + "  ");
//        }
//        range r1 = new range();
//        int[] ssse = r1.newrange(1000, 20);
//
//        for (int x : ssse) {
//            System.out.println(x);
//        }
//        outer:
//        for (int i = 0; i < 100; i++) {
//            inner:
//            for (int j = 0; j < 100; j++) {
//                System.out.println("pig!");
//
//                if (i % 2 == 0) {
//                    continue inner;
//                }
//            }
//            range r =new range();
//            int[] s = r.newrange(26, 1);
//            System.out.println((char)(s[0]+'a'));
//
////        System.out.println(r1.newrange(100,2));
//
//        }
        fibonaqie f = new fibonaqie();
        for (int i=1;i<=5;i++) {
            System.out.print(f.fibo(i));
            System.out.print('\t');
        }

    }
}

class fibonaqie{

    int  fibo(int i) {
        if (i == 1 || i == 2) {
//            System.out.print(1+'\t');
            return 1;
        } else {
            int reee = (fibo(i - 1) + fibo(i - 2));
//            System.out.print(reee+' ');
            return fibo(i - 1) + fibo(i - 2);
        }

    }
} 
