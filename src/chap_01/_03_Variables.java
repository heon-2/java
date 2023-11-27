package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "이지헌";
        Integer hour;
        hour = 15;
        System.out.println(name + "님, 배송이 시작됩니다. 15시에 방문 예정입니다.");
        System.out.println("이지헌님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");

        double score = 90.5;
        char grade = 'A'; // char은 작은 따옴표
        name = "자바";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

    }
}
