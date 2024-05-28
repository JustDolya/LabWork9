class Student {
    private String FIO;
    private int yearAdmission;
    private String address;
    private String telephoneNumber;
    private int course;
    private String faculty;

    Student(String FIO, int yearAdmission, String address, String telephoneNumber, int course, String faculty){
        this.FIO = FIO;
        this.yearAdmission = yearAdmission;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.course = course;
        this.faculty = faculty;
    }

    public String getFio(){
        return this.FIO;
    }
    public void setFIO(String FIO){
        this.FIO = FIO;
    }

    public int getYearAdmission(){
        return this.yearAdmission;
    }
    public void setYearAdmission(int yearAdmission){
        this.yearAdmission = yearAdmission;
    }

    public String getAddress(){
        return this.address;
    }

    public String getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public String getFaculty(){
        return this.faculty;
    }
}

public class Main{
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Крянин И.В.", 2020, "ул. Баунина, 14", "+79472884930", 4, "Программирование"),
                new Student("Зябкин И.М.", 2020, "ул. Пушкина, 7", "+79532886980", 4, "Программирование"),
                new Student("Никитин А.П.", 2022, "ул. Пугачёва, 19", "+79528490472", 2, "Безопасность"),
        };

        printStudentsFIO(students);
        printStudentsByFaculty(students, "Программирование");
        printStudentsByYearAdmission(students, 2021);
    }

    public static void printStudentsFIO(Student[] students){
        for(Student student : students)
            System.out.println(student.getFio());

        System.out.println();
    }

    public static void printStudentsByFaculty(Student[] students, String faculty){
        for(Student student : students){
            if(student.getFaculty() == faculty)
                System.out.printf("%s | %s | %d | %s ",
                        student.getFio(), student.getFaculty(), student.getYearAdmission(), student.getAddress());

            System.out.println();
        }
    }

    public static void printStudentsByYearAdmission(Student[] students, int year){
        for(Student student : students){
            if(student.getYearAdmission() > year)
                System.out.printf("%s | %s | %d | %s ",
                        student.getFio(), student.getFaculty(), student.getYearAdmission(), student.getAddress());

            System.out.printf("");
        }
    }
}