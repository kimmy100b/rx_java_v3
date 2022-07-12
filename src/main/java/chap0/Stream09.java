package chap0;

/**
 * 스트림의 중개 연산(intermediate operation)
 */

import java.util.Comparator;
import java.util.stream.Stream;

public class Stream09 {
    public static void main(String[] args){
        Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

        // sorted() 메소드 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        // 오름차순으로 정렬 - Comparable 인터페이스의 compareTo 메서드를 기준으로 하기 때문에
        stream1.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // 내림차순으로 정렬
        stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    }
}
