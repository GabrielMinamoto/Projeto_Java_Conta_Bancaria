public class main_Aluno2 {
    public static void main(String[] args) {

        //SETTERS
        Aluno2 student = new Aluno2("Gabriel", 10, 2, 8);

        //GETTERS
        System.out.println("First grade: " + student.getGrade1());
        System.out.println("Second grade: " + student.getGrade2());
        System.out.println("Third grade: " + student.getGrade3());

        System.out.println("The media of grades: " + student.media());
    }
}
