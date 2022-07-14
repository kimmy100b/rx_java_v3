package chap0;

/**
 * 스트림의 최종 연산(terminal operation)
 * => 마지막으로 최종 연산을 통해 각 요소를 소모하여 결과를 표시
 *
 * 1. 요소의 출력 : forEach() - pass
 * 2. 요소의 소모 : reduce()
 * 3. 요소의 검색 : findFirst(), findAny()
 * 4. 요소의 검사 : anyMatch(), allMatch(), noneMatch()
 * 5. 요소의 통계 : count(), min(), max()
 * 6. 요소의 연산 : sum(), average()
 * 7. 요소의 수집 : collect()
 *
 */

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream11 {
    public static void main(String[] args) {
        // reduce() 메소드 : 첫 번째와 두 번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세 번째 요소를 가지고 또다시 연산을 수행
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");

        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println);

        String result2 = stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2);
        System.out.println(result2);
        System.out.println();

        // Int Stream
        IntStream intStream1 = IntStream.of(1,2,3,4,5);
        IntStream intStream2 = IntStream.of(1,2,3,4,5);

        // Optional : Integer나 Double 클래스처럼 'T'타입의 객체를 포장해 주는 래퍼 클래스
        // Optional 객체를 사용하면 예상치 못한 NullPointerException 예외를 제공되는 메소드로 간단히 회피할 수 있다.
        OptionalInt intRs1 = intStream1.reduce((s1, s2) -> s1 + s2);
        intRs1.ifPresent(System.out::println);

        Integer intRs2 = intStream2.reduce(10, (s1, s2) -> s1 + s2);
        System.out.println(intRs2);
    }
}
