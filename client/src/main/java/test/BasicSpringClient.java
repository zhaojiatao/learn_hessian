package test;

import com.zjt.learn.hessian.api.GetUserInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaojiatao@souche.com on 2018/4/18
 */
public class BasicSpringClient {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        GetUserInfo getUserInfo = (GetUserInfo)context.getBean("getuserService");
        System.out.println(getUserInfo.getuserinfo("1"));
    }


}
