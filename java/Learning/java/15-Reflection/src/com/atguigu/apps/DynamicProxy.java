package com.atguigu.apps;

import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/5/9 - 22:02
 */
public class DynamicProxy {
    //区别于静态代理：即静态代理编译时就确定了代理与被代理关系
    @Test
    public void staticProxy(){
        class Server implements LoginTest{

            @Override
            public void login() {
                System.out.println("服务器登录");
            }
        }
        class ProxyServer implements LoginTest{
            private LoginTest server;

            public ProxyServer(LoginTest server){
                this.server = server;
            }

            @Override
            public void login() {
                System.out.println("代理类-登录前准备");
                server.login();
                System.out.println("代理类-登录后收尾");
            }
        }

        Server serve = new Server();
        ProxyServer proxyServe = new ProxyServer(serve);
        proxyServe.login();
    }

    @Test
    public void test(){

    }
}
