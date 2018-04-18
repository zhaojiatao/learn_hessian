package test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zjt.learn.hession.api.GetUserInfo;

/**
 * Created by zhaojiatao@souche.com on 2018/4/17
 */
public class BasicClient {

    public static void main(String[] args) {
        try {
            String url = "http://localhost:8080/hessian";
            HessianProxyFactory factory = new HessianProxyFactory();
            factory.setOverloadEnabled(true);
            GetUserInfo getUserInfo = (GetUserInfo) factory.create(GetUserInfo.class, url);
            System.out.println(getUserInfo.getuserinfo("1"));
            System.out.println("over");
        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
