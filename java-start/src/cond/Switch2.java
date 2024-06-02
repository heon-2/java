package cond;

public class Switch2 {
    public static void main(String[] args) {
        // 자바 14부터 새로운 switch문이 정식 도입됨.
        // 써보니깐 코틀린이랑 비슷한 거 같은데?
        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);

    }
}

