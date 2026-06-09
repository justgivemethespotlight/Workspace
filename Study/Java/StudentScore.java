class Student {
    String name;
    int score;
    
    int maxIndex = 0;
    int maxScore = 1;

    for(int i=0;i<Student.length;i++) {
        if(Student[i].getscore() > maxScore) {
            maxScore = Student[i].getscore();
            maxIndex = i;
        }
    }

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class StudentScore {
    public static void main(String[] args) {
        Student s1 = new Student("권율", 85);
        System.out.println("이름 :" + s1.name);
        System.out.println(s1.score + "점");
    }
}
