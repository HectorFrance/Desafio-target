import service.*;

public class Main {
    public static void main(String[] args) {

        Questao01 q1 = new Questao01();
        Questao02 q2 = new Questao02();
        Qeustao03 q3 = new Qeustao03();
        Questao04 q4 = new Questao04();
        Questao05 q5 = new Questao05();

        System.out.println("-------------------QUESÃO 01 -------------------");
        q1.loopQuestão();
        System.out.println();

        System.out.println("-------------------QUESÃO 02 -------------------");
        q2.perteceFibonacci(21);
        q2.perteceFibonacci(56);
        System.out.println();

        System.out.println("-------------------QUESÃO 03 -------------------");
        q3.lerFaturamento();
        System.out.println();

        System.out.println("-------------------QUESÃO 04 -------------------");
        q4.calcularProcentagem();
        System.out.println();

        System.out.println("-------------------QUESÃO 05 -------------------");
        q5.inverterString("HEITOR FRANÇA");
    }
}