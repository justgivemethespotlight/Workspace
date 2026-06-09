class CarWithGetterSetter {
    String brand;
    String model;
    int year;
    // Getter method는 그 필드값을 반환하는 매서드
    // getHelloWorld
    // get + 필드이름(맨 앞 글자를 대문자로, get을 무조건 붙임)

    String getBrand() {
        return brand;
    }
    String getModel() {
        return model;
    }
    int getYear() {
        return year;
    }

    // Setter method는 그 필드값을 대입해서 값을 부여하는 매서드
    // setHelloWorld
    // set + 필드이름(맨 앞 글자를 대문자로, set을 무조건 붙임)
    void setBrand(String b) {
        this.brand = b;
    }
    // setModel, SetYear
    void setModel(String mo) {
        this.model = mo;
    }
    void setYear(int paramYear) {
        if (paramYear < 1886) {
            this.year = paramYear;
        }
    }
    // 필드랑 매개변수의 이름이 같을 때, 필드에 접근하려면 this.필드이름으로 접근해야 한다.
    // getter, setter는 자동생성 해도 되지만, 지금은 직접 이해를 해야함.

    // 필드, 메서드 개념, 게터, 세터 
}

class TextClass {
    public void printHelloWorld() {
        System.out.println("Hello World");
    }

    public String getHelloWorld() {
        return "Hello World";
    }
}

public class GetterSetterDemo {
    public static void main(String[] args) {
        CarWithGetterSetter o = new CarWithGetterSetter();
        o.setBrand("BMW");
        o.setModel("M2 cs");
        o.setYear(2024);
        System.out.println(o.getBrand() + o.getModel() + o.getYear());

        CarWithGetterSetter o2 = new CarWithGetterSetter();
        o2.setBrand("Mercedes-Benz");
        o2.setModel("AMG GT");
        o2.setYear(2023);
        System.out.println(o2.getBrand() + o2.getModel() + o2.getYear());
    }
}