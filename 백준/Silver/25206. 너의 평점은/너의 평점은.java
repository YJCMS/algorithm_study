import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sumCreditGrade = 0;
        double sumCredit = 0;

        for(int i = 0; i <20; i++) {

            String name = in.next();
            double credit = in.nextDouble();
            String grade = in.next();

           if(grade.equals("A+")) {
               sumCreditGrade += credit * 4.5;
               sumCredit += credit;
           } else if (grade.equals("A0")) {
               sumCreditGrade += credit * 4.0;
               sumCredit += credit;
           } else if (grade.equals("B+")) {
               sumCreditGrade += credit * 3.5;
               sumCredit += credit;
           } else if (grade.equals("B0")) {
               sumCreditGrade += credit * 3.0;
               sumCredit += credit;
           } else if (grade.equals("C+")) {
               sumCreditGrade += credit * 2.5;
               sumCredit += credit;
           } else if (grade.equals("C0")) {
               sumCreditGrade += credit * 2.0;
               sumCredit += credit;
           } else if (grade.equals("D+")) {
               sumCreditGrade += credit * 1.5;
               sumCredit += credit;
           } else if (grade.equals("D0")) {
               sumCreditGrade += credit * 1.0;
               sumCredit += credit;
           } else if (grade.equals("F")) {
               sumCreditGrade += credit * 0.0;
               sumCredit += credit;
           }
        }
        System.out.printf("%.6f", sumCreditGrade / sumCredit);
    }
}