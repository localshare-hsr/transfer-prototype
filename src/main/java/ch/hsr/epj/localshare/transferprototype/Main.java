package ch.hsr.epj.localshare.transferprototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread httpServerThread = new Thread(new LsHttpServer());
        httpServerThread.setDaemon(true);
        httpServerThread.start();
        httpServerThread.join();
    }
}