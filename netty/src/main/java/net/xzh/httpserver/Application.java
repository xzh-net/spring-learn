package net.xzh.httpserver;

/**
 * 2018/11/2.
 */
public class Application {

    public static void main(String[] args) throws Exception{
        HttpServer server = new HttpServer(8081);
        server.start();
    }
}
