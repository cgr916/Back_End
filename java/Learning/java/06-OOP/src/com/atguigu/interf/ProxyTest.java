package com.atguigu.interf;

/**
 * @author: cgr
 * @date: 2022/4/2 - 16:36
 */
public class ProxyTest {
    public static void main(String[] args) {
        ProxyServer server = new ProxyServer(new Server());
        server.browse();
    }
}

interface Network{
    public void browse();
}

class Server implements Network{

    @Override
    public void browse() {
        System.out.println("真实的服务器");
    }
}

class ProxyServer implements Network {
    private Network server;

    public ProxyServer(Network server){
        this.server = server;
    }

    public void check() {
        System.out.println("检查工作");
    }

    @Override
    public void browse() {
        check();
        server.browse();
    }
}
