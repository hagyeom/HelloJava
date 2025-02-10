package chapter11.lecture;

import chapter07.lecture.Car;

public class ClassExample {
    public static void main(String[] args) throws ClassNotFoundException {
        // 첫 번째 방법
        Class clazz = Car.class;

        // 두 번째 방법
        clazz = Class.forName("chapter07.lecture.Car");

        // 세 번째 방법
        Car car = new Car();
        clazz = car.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
    }
}
