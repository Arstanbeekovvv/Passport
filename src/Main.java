import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentFull stdnt1 = new StudentFull("Mirlan", "Kyrgyz", "07.04.2002", 996771900091L);
        StudentFull stdnt2 = new StudentFull("Mirla", "Deutsche", "08.05.2003", 996771900092L);
        StudentFull stdnt3 = new StudentFull("Mirl", "Kazak", "09.06.2004", 996771900093L);
        StudentFull stdnt4 = new StudentFull("Mir", "Kyrgyz", "01.07.2005", 996771900094L);
        StudentFull stdnt5 = new StudentFull("Mi", "American", "02.08.2006", 996771900095L);
        StudentFull[] studentFulls = {stdnt1, stdnt2, stdnt3, stdnt4, stdnt5};
        for (StudentFull studentFull : studentFulls) {
            System.out.println(STR."""
                        Maalymat
                    \{studentFull.name}
                    \{studentFull.dateOfBirth}
                    \{studentFull.nationality}
                    \{studentFull.phoneNumber}\n
                    """);
        }

    }
}