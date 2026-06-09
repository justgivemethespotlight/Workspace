class Car {
    // 상태 = "필드" (field)
    String brand; // 참조형에서는 기본값이 null, 
    String model;
    int year; // 숫자형에서 정수형(ex: int)은 0, 숫자형에서 실수형(float, double)은 0.0, 
    boolean engineRunning; // 논리형(ex: boolean)에서는 false
    
    void drive(String destination) { // 매서드 시작
        if (engineRunning) { // 로직 시작
            System.out.println(destination + "으로 이동");
        } else {
            System.out.println("시동을 켜세요.");
        } // 로직 끝
    } // 매서드 끝

    void startEngine() {
        engineRunning = true;
    }

    void stopEngine() {
        engineRunning = false;
    }
}

class Student {
    String name;
    int age;
}

public class OOP {
    public static void main(String[] args) {
        Car car1 = new Car(); // Car 타입 (참조형 타입)
        Student student1 = new Student();

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        car1.brand = "BMW";
        car1.model = "M5 F90 LCI 2023";
        car1.year = 2023;
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        student1.name = "안지민";
        student1.age = 17;
        System.out.println(student1.name);
        System.out.println(student1.age);
    }
}
