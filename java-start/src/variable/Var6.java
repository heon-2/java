package variable;

public class Var6 {
    public static void main(String[] args) {
        int a;
//        System.out.println(a); // java: variable a might not have been initialized
        // 자바는 변수를 초기화 하도록 강제.
        // 초기화하지 않으면 그 공간에 기존에 어떤 값이 들어있었는지 아무도 모르기 때문에 이상한 값이 출력될 수도.
        // 가장 좋은 에러는 컴파일 에러, 나쁜 에러는 런타임ㅇ ㅔ러.. 라고 하심.
        // 컴파일 에러는 오류를 빨리, 명확하게 찾을 수 있기 때문에 사실은 좋은 에러.
        // 위의 처럼 int a로 선언만 해놓고 사용하지 않으면, 컴파일 단계에서 알아서 사용하지 않는 변수들을 없애버림.

    }
}
