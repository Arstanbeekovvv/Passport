public class Student {
    String name, group;
    byte age;

    public Student(){

    }
}
/*Student students;
        Student[] arrays = new Student[3];
        int java = 0, js = 0;
        for (int i = 0; i < arrays.length; i++) {
            students = new Student();
            System.out.print("\nYour name: ");
            students.name = new Scanner(System.in).nextLine();
            System.out.print("Your group: ");
            students.group = new Scanner(System.in).nextLine();
            System.out.print("Your age: ");
            students.age = new Scanner(System.in).nextByte();
            arrays[i] = students;
            if(students.group.equalsIgnoreCase("java")) java++;
            else if (students.group.equalsIgnoreCase("js")) js++;

        }
        int summa = 0;
        for (Student array : arrays) {
            System.out.println("Name: " + array.name +"\n" + "Groupe: " +array.group + "\n" + "Age: " + array.age + "\n");
            summa += array.age;
        }
        System.out.println("Group java: " + java + "\nGroup js: " + js);
        System.out.println("Srednee arifmeticeskie znachenie: " + (float)summa / arrays.length);
   */