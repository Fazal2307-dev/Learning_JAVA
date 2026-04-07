class Student{
    public void getStudent() {
        String student[] = new String[4];
        student[0]="Fazal";
        student[1]="Nabeel";
        student[2]="Aman";
        student[3]="Afzal";
        for(int i =0;i<student.length;i++) {
            System.out.println("Index[" + i + "] Student name: " + student[i]);
        }
    }
}
public class Array {

    public static void main(String[] args) {

        Student student= new Student();
        student.getStudent();
    }

}