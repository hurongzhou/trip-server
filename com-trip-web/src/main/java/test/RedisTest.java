package test;

import com.trip.common.redis.RedisUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class RedisTest {

    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        long today=c.getTimeInMillis()/1000;
        long cur=System.currentTimeMillis()/1000;
        long left=today-cur+25*3600;
        System.out.println(left/3600);
    }
}
