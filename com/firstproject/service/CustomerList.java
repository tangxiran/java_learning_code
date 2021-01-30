package com.firstproject.service;/**
 * @Classname CustomerList
 * @Description TODO
 * @Date 2021/1/30 16:21
 * @Created by wangxutao
 * 操作方式，对用户
 *
 */

import com.firstproject.bean.Customer;
import com.sun.corba.se.impl.oa.toa.TOA;
import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.plugin.PluginURLJarFileCallBack;

import java.util.*;

public class CustomerList {
    private Customer[] clist ;
    private int total = 0;

    /**
     * 初始化数组的构造器
     * 指定数组长度
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer) {
        clist = new Customer[totalCustomer];

    }
    public boolean addcustomer(Customer customer) {
        if (total >= clist.length) {
            return false;
        }
        clist[total++] = customer;
        return true;
    }

    public boolean replace_customer(int index,Customer ctemp) {
        if (index > total - 1 ||index<0) {
            return false;
        } else {
            clist[index] = ctemp;
        }
        return true;
    }
    public boolean delete_customer(int index) {
        if (index >=total || index<0) {
            return false;
        } else {
            for (int i = index; i <= total-1; i++) {
                clist[i] = clist[++i];
            }
            clist[total - 1] = null;
            total = total - 1;
        }
        return true;
    }

    public Customer[] getClist() {
        Customer[] cust = new Customer[total];
    for(int i=0;i<total;i++){
        cust[i] = clist[i];
    }
        return cust;
    }
    public Customer getCustomer (int index ){
        if (index<0||index>total-1){
            return null;}
        return clist[index];
    }

    public int getTotal() {
        return total;
    }
}
