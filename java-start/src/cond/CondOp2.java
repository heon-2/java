package cond;

public class CondOp2 {
    public static void main(String[] args) {
        // 삼항연산자는 자바에서 유일하게 항이 3개. -> if문처럼 코드 블럭을 넣을 수 있는 것이 아닌, 단순한 표현식만 넣을 수 있다.
        int age = 18;
        String status = (age>=18) ? "성인" : "미성년자";

        System.out.println("age = " + age + " status = " + status);
        
    }
}
