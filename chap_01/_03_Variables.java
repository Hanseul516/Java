package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name = "두슬";
        int hour = 15;
        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균점수는" + score + "점입니다.");
        System.out.println(name + "님의 학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까?" + pass);

        double d = 3.14; // 정밀한 소수일때
        float f = 3.14f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l; 
        l = 1_000_000_000_000l;
        System.out.println(l);

        //int, long, float, double, char, String, boolean
    };
}
