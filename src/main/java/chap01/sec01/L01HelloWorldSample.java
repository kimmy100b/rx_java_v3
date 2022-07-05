package chap01.sec01;

import io.reactivex.rxjava3.core.Flowable;

public class L01HelloWorldSample {
    public static void main(String[] args) {
        Flowable<String> flowable = Flowable.just("Hello", "World");
        flowable.subscribe(data -> System.out.println(data));
    }
}
