package chap01.sec03;

import io.reactivex.rxjava3.core.Flowable;

public class L08L09FunctionalTimingSample {
    public static void main(String[] args) throws Exception {
        // 값을 인자로 전달받는 just 메서드에서 Flowable을 생성 -> 생성된 시점에 시스템 시각을 전달
        Flowable<Long> flowable1 = Flowable.just(System.currentTimeMillis());
        // 메서드가 처리를 수행하는 시점에 정의된 처리를 실행해 값을 가져온다.
        Flowable<Long> flowable2 = Flowable.fromCallable(() -> System.currentTimeMillis());
        flowable1.subscribe(data -> System.out.println("flowable1: " + data));
        flowable2.subscribe(data -> System.out.println("flowable2: " + data));

        // 잠시 기다린다
        Thread.sleep(1000L);

        flowable1.subscribe(data -> System.out.println("flowable1: " + data));
        flowable2.subscribe(data -> System.out.println("flowable2: " + data));
    }
}
