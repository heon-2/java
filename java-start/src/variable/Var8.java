package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // -2147483648 ~ 2147483,647 (약 20억)

        long l = 9223372036854775807L; // 뒤에 L을 붙여야함. l도가능한데 약간 1이랑 비슷해서 권장하지 않음.

        // 실수
        float f = 10.0f; // 뒤에 f를 붙여야함.
        double d = 10.0;

        // 타입을 쓰는 것에 따라서 메모리 차이가 있지만, 메모리 용량은 매우 저렴하기 때문에
        // 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에 초점을 맞추는 것이 더 효과적이다.
        // byte,short,float,char 모두 실무에선 사용 잘 X
        // 그래서 자주 사용하는 것 -> int,long,double,boolean, String

    }
}
