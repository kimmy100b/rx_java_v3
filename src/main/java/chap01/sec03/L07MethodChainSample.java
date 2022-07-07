package chap01.sec03;

import io.reactivex.rxjava3.core.Flowable;

public class L07MethodChainSample {
    public static void main(String[] args) {
        // 데이터를 순서대로 전달하는 Flowable을 생성
        Flowable<Integer> flowable = Flowable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(data -> data % 2 == 0) // 짝수 데이터만 전달
                .map(data -> data * 100); // 데이터를 100배로 변환
        flowable.subscribe(data -> System.out.println("data=" + data));
    }
}
