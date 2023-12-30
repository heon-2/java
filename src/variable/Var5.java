package variable;

public class Var5 {
    public static void main(String[] args) {
        // 1. 변수 선언, 초기화 각각 따로
        int a;
        a = 1;
        System.out.println(a);
        int b  = 2; // 변수 선언과 초기화 동시에
        System.out.println(b);

        int c = 3, d= 4; // 3. 여러 변수 선언과 초기화 한번에 가능.
        System.out.println(c);
        System.out.println(d);

        // 변수는 꼭 초기화를 해야 함. -> 안하면 오류 떠
//        int a;
//        System.out.println(a);

        // 컴파일 에러는 좋은 에러. 개발을 할 떄에도 컴파일 에러가 잘 발생하도록 장치를 하는 것이 중요함.
    }
}
