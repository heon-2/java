package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2*2) + (3*3)
        int sum4 = (2 * 2) + (3 * 3); // sum3
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        // 연산자 우선순위가 복잡한 경우에는 그냥 괄호를 넣는게 명확함.

        // 연산자 우선순위 암기법
        // 실무 개발자들은 연산자 우선순위를 외우지 않는다.
        // 괄호가 가장 높기 때문에 우선순위는 상식선에서 생각하면 됨.
        // 그리고 애매하면 괄호 넣으면 됨. 그게 더 가독성이 좋음.

    }
}
