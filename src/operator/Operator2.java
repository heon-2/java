package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기 1
        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기
        int num = 20;
        String str = "a + b = ";
        String result4 = "a + b = 20";
        System.out.println(result4); // a + b = 20 , 숫자랑 문자 더하면 문자가 돼


    }
}

