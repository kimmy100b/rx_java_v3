package chap0;

/**
 * 스트림의 최종 연산(terminal operation)
 *
 * 3. 요소의 검색 : findFirst(), findAny()
 *
 */

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream12 {
    public static void main(String[] args) {
        // findFirst()와 findAny() 메소드는 해당 스트림에서 첫 번째 요소를 참조하는 Optional 객체를 반환
        // 병렬 스트림인 경우에는 findAny() 메소드를 사용해야만 정확한 연산 결과를 반환
        IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

        OptionalInt result1 = stream1.sorted().findFirst();
        System.out.println(result1.getAsInt());

        OptionalInt result2 = stream2.sorted().findAny();
        System.out.println(result2.getAsInt());
    }
}
