package chap_01;

public class _03_Variables {
    public _03_Variables() {
    }

    public static void main(String[] args) {
        String name = "이지헌";
        Integer hour = 15;
        System.out.println(name + "님, 배송이 시작됩니다. 15시에 방문 예정입니다.");
        System.out.println("이지헌님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        double score = 90.5;
        char grade = 'A';
        name = "자바";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");
        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        // 보다 정밀한 소수를 다루고 싶을 때는 Double
        double d = 3.14123456789;
        float f = 3.14123456789f; // 3.1412346

        // 엄청 큰 int를 다루고 싶으면 int 대신 long
        long l = 10000000000000L;
        // char: 하나의 문자, String: 여러개의 문자
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);


    }
}
