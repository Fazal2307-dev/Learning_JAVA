class Teacher{
    void doTeaching(){
        System.out.println("Teacher.doTeaching");
    }
}
class Student extends Teacher{
    @Override
    void doTeaching() {
        System.out.println("Student.doTeaching");
    }
}
public class TeacherStudentRelationPoly {
    public static void main(String args[]){
        Teacher teacher = new Student();
        teacher.doTeaching();;
    }
}