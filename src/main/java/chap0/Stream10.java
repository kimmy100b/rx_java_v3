package chap0;

/**
 * 스트림의 중개 연산(intermediate operation)
 */

import java.util.stream.IntStream;

public class Stream10 {
    public static void main(String[] args) {
        // peek() 메소드 : 결과 스트림으로부터 요소를 소모하여 추가로 명시된 동작을 수행
        // 원본 스트림에서 요소를 소모하지 않으므로, 주로 연산과 연산 사이에 결과를 확인하고 싶을 때 사용
        IntStream stream = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        stream.peek(s -> System.out.println("원본 스트림 : " + s))
                .skip(2) // 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림을 반환
                .peek(s -> System.out.println("skip(2) 실행 후 : " + s))
                .limit(5) // 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환
                .peek(s -> System.out.println("limit(5) 실행 후 : " + s))
                .sorted()
                .peek(s -> System.out.println("sorted() 실행 후 : " + s))
                .forEach(n -> System.out.println(n));
    }
}
