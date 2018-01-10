package test;

import java.util.ArrayList;
import java.util.List;

public class RedisTest {

    public static void main(String[] args){
        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        List<Integer> list1=list.subList(0,2);
        System.out.println(list==list1);
    }
}
