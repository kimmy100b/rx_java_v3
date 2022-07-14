package chap0;

/**
 * 스트림의 최종 연산(terminal operation)
 *
 * 7. 요소의 수집 : collect()
 *
 * Collects 메소드 :
 ** 1. 스트림을 배열이나 컬렉션으로 변환 : toArray(), toCollection(), toList(), toSet(), toMap()
 ** 2. 요소의 통계와 연산 메소드와 같은 동작을 수행 : counting(), maxBy(), minBy(), summingInt(), averagingInt() 등
 ** 3. 요소의 소모와 같은 동작을 수행 : reducing(), joining()
 ** 4. 요소의 그룹화와 분할 : groupingBy(), partitioningBy()
 *
 */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream17 {
    public static void main(String[] args) {
        // partitioningBy() 메소드를 이용하여 해당 스트림의 각 요소별 글자 수에 따라 홀수와 짝수로 나누어 저장하는 예제
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "PHP");

        Map<Boolean, List<String>> patition = stream.collect(Collectors.partitioningBy(s ->  (s.length() % 2) == 0));
        List<String> oddLengthList = patition.get(false); // (s.length() % 2) != 0
        System.out.println(oddLengthList);

        List<String> evenLengthList = patition.get(true); // (s.length() % 2) == 0
        System.out.println(evenLengthList);


        // partitioningBy() 메소드를 이용하여 해당 스트림의 3의 배수를 나누어 저장하는 예제
        IntStream stream1 = IntStream.range(1, 20);

        // Map<Boolean, List<Long>> patition1 = stream1.collect(Collectors.partitioningBy(s -> (s % 3) == 0)); // mapToObj가 필요하다. 참고) https://dev-kani.tistory.com/32
        Map<Boolean, List<Long>> patition1 = stream1.mapToObj(Long::new).collect(Collectors.partitioningBy(s -> (s % 3) == 0));

        List<Long> multipleThree = patition1.get(false); // 3의 배수가 아닌 값
        System.out.println(multipleThree);

        List<Long> multipleNotThree = patition1.get(true); // 3의 배수
        System.out.println(multipleNotThree);
    }
}