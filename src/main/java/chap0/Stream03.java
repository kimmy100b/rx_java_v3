package chap0;

import java.util.stream.Stream;

public class Stream03 {
    public static void main(String[] args){
        // of() 메서드를 통해 가변 매개변수에서 스트림 생성
        // 가변 매개변수 : 유동적으로 변하는 함수. 매개변수를 몇 개 넣든 상관없는 함수
        Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9);
        stream.forEach(System.out::println);
    }
}
