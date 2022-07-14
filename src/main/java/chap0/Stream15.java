package chap0;

/**
 * 스트림의 최종 연산(terminal operation)
 *
 * 6. 요소의 연산 : sum(), average()
 *
 */

import java.util.stream.IntStream;

public class Stream15 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(1, 2, 3, 4);
        IntStream stream2 = IntStream.of(1, 2, 3, 4);

        System.out.println(stream1.sum());
        System.out.println(stream2.average().getAsDouble()); // average() : Optional 객체로 반환
    }
}
