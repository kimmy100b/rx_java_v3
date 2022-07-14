package chap0;

/**
 * 스트림의 최종 연산(terminal operation)
 *
 * 4. 요소의 검사 : anyMatch(), allMatch(), noneMatch()
 *
 */

import java.util.stream.IntStream;

public class Stream13 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);
        IntStream stream3 = IntStream.of(30, 90, 70, 10);

        // anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우에 true를 반환함.
        // 스트림의 요소 중 하나라도 조건에 만족할 경우
        System.out.println(stream1.anyMatch(n -> n > 80));
        // allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우에 true를 반환함
        // 스트림의 모든 요소가 조건에 만족할 경우
        System.out.println(stream2.allMatch(n -> n > 80));
        // noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않을 경우에 true를 반환함
        // 스트림의 모든 요소가 조건에 만족하지 않을 경우
        System.out.println(stream3.noneMatch(n -> n > 100));
    }
}
