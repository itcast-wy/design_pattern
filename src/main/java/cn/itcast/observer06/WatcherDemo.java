package cn.itcast.observer06;

import java.util.Observable;
import java.util.Observer;

public class WatcherDemo {
    public static void main(String[] args) {
        Watched watched = new Watched();
        Watcher watcher = new Watcher();

        watched.addObserver(watcher);
        watched.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                if (arg.toString().equals("closeWindow")) {
                    System.out.println("关闭窗口");
                }
            }
        });

        watched.notifyObservers("openWindow");
        watched.notifyObservers("closeWindow");
    }
}