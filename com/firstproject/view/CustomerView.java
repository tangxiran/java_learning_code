package com.firstproject.view;/**
 * @Classname CustomerView
 * @Description TODO
 * @Date 2021/1/30 16:22
 * @Created by wangxutao
 */

import com.firstproject.bean.Customer;
import com.firstproject.service.CustomerList;
import com.sun.imageio.spi.OutputStreamImageOutputStreamSpi;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.swing.text.AsyncBoxView;
import java.lang.annotation.Repeatable;
import java.lang.reflect.GenericArrayType;
import java.nio.file.Watchable;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    private void enterview() {
        Customer wa = new Customer("wa", "291477206@qq.com","1325646",'b',12 );
        customerList.addcustomer(wa);
        boolean flag= true;
        Scanner s = new Scanner(System.in);
        while (flag){
        System.out.println("1---add\n2---replace\n3---delete\n4---show_all\n5---exit");
        System.out.println("select:(1-5)");
            int i = s.nextInt();
            switch (i) {
                case 1:addview();break;
                case 2:replaceview();break;
                case 3:deleteview();;break;
                case 4:showview();break;
                case 5:
                    System.out.println("sure 1/0:");
                    int choice = s.nextInt();
                    if (choice == 1) {
                        System.out.println("out!");
                        flag = false;
                    }
            }
                //            flag = false;
        }
    }
    private void deleteview() {
        Scanner s = new Scanner(System.in);
        int index;
        for (; ; ) {
            System.out.println("delete：which index?");
            index = s.nextInt();
            if (index <= 0 || index > customerList.getTotal()) {
                return;
            }
            Customer cu = customerList.getCustomer(index - 1);
            if (cu == null) {
                System.out.println("no user ");
            } else {
                break;
            }
        }
//find this cusometr
        customerList.delete_customer(index-1);
    }

    private void addview() {
        System.out.println("add user!");
        Scanner s = new Scanner(System.in);

        System.out.println("name:");
        String name = s.next();
        System.out.println("age:");
        Integer age  = s.nextInt();
        System.out.println("email:");
        String email=s.next();
        System.out.println("phone:");
        String phone=s.next();
        System.out.println("gender:");
        char gender = s.next().charAt(0);
        Customer customer = new Customer(name,email,phone, gender,age);
        boolean success =customerList.addcustomer(customer);
        if (success == true) {
            System.out.println("success--------------------");
        }else {System.out.println("----会员满了加不进去 ----------------");}



    }
    private void replaceview() {
        System.out.println("replace which index:");
        Customer cu;
        int i;
        Scanner s = new Scanner(System.in);
        for (;;) {
            i = s.nextInt();
            if (i == -1) {
                return;
            }
            cu = customerList.getCustomer(i - 1);
            if (cu == null) {
                System.out.println("no user");
            } else {
                //find it
                break;
            }
        }
        //修改客户信息
         System.out.println("姓名:"+cu.getName()+":");
        String name = s.next();
        System.out.println("年龄:"+cu.getName()+":");
        int age = s.nextInt();
        System.out.println("emali:"+cu.getName()+":");
        String email = s.next();
        System.out.println("sex:"+cu.getName()+":");
        char sex = s.next().charAt(0);
        System.out.println("phone:"+cu.getName()+":");
        String phone = s.next();
        Customer new_cumoster = new Customer(name, email, phone, sex, age);
//        修改的错误，要注意i-1
        boolean replace_success =customerList.replace_customer(i-1 , new_cumoster);
        if (replace_success) {
            System.out.println("--------------replace success");
        }
        else {
            System.out.println("--------------replace false{");
        }


    }
    private void showview() {
        System.out.println("#########   all users  ########");
        if(customerList.getTotal()==0){System.out.println("no one!");}
        else {
            System.out.println("index\tname\tsex\tage\tphone\temail");
            Customer[] cus =customerList.getClist();
            for(int i=0;i<cus.length;i++){
                Customer cu = cus[i];
                System.out.print(i + 1 + "\t" + '\t'+ cu.getName() + '\t'+ '\t' + cu.getGender() + '\t'+ '\t' + cu.getAge()+ '\t'+'\t'+cu.getPhone()+'\t'+ '\t'+cu.getEmail());
            System.out.println();
            }

        }
        System.out.println();
        System.out.println("#########   all users  ########");

    }

    public static void main(String[] args) {
        CustomerView cv = new CustomerView();
        cv.enterview();
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
    }

}
