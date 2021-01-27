//https://www.bilibili.com/video/BV18b411t7Nc?p=127
package bzhan;/**
 * @Classname FamilyAccountRecord
 * @Description TODO
 * @Date 2021/1/27 15:13
 * @Created by wangxutao
 */

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;
import jdk.nashorn.internal.ir.WhileNode;
import sun.text.normalizer.Utility;

import javax.activation.MailcapCommandMap;
import javax.rmi.CORBA.Util;
import java.util.*;
class readchar{
    static char readchar_fromBoard(){
        char ch='a';
        while (true) {
            Scanner sc=new Scanner(System.in);
            String c=sc.nextLine();

            if (c.length()!= 1) {
                System.out.println("wrong input,1 char please !\n ");
            }
            else {
                ch = c.charAt(0);
                break;}
        }
        return ch;
    }
}

public class FamilyAccountRecord {
    public static void main(String[] args) {
        boolean isflag = true;
        while (isflag) {
            System.out.println("**********家庭收入说明*********");
            System.out.println("      1收支明细");
            System.out.println("      2点击收入");
            System.out.println("      3等级支出");
            System.out.println("      4退   出\n");
            System.out.println("请输入选择1-4");
            char c = readchar.readchar_fromBoard();
            if (c!='1'&&c!='3'&&c!='2'&&c!='4') {
                System.out.println("bad select,select again");
            }else {
                break;
        }
        }
    }}
