package variable;

public class Var1 {
    // 첫글자는 관례상 대문자
    public static void main(String[] args) {
        // 변수를 사용하는 이유는 동일한 값을 여러번 출력해야할 때,
        // 일일이 값들을 바꾸기 보다는 변수값만 수정하면 되므로
        // 추가로 가독성을 좋게하기 위함도 있겠지? ex) 3.14를 출력하는 것보다 pi를 출력하는게 가독성 
        int a; // 변수 선언
        a = 10; // 변수 초기화
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
    }
}
