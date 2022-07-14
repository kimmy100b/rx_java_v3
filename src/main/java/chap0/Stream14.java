package chap0;

/**
 * 스트림의 최종 연산(terminal operation)
 *
 * 5. 요소의 통계 : count(), min(), max()
 *
 */

import java.util.stream.IntStream;

public class Stream14 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);
        IntStream stream3 = IntStream.of(30, 90, 70, 10);

        // count() : 해당 스트림의 요소의 총 개수를 long 타입의 값으로 반환
        System.out.println(stream1.count());
        // max() min() : 해당 스트림의 요소 중에서 가장 큰 값과 가장 작은 값을 가지는 요소를 참조하는 Optional 객체로 반환
        System.out.println(stream2.max().getAsInt());
        System.out.println(stream3.min().getAsInt());
    }
}
