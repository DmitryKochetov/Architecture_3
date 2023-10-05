// Базовое задние:


// ​
// Задачи со *(подсказок нет!, это же сложные задания)
// 4) Переписать код в соответствии с Liskov Substitution Principle:
// public class Rectangle {
// private int width;
// private int height;
// public void setWidth(int width) {
// this.width = width;
// }
// public void setHeight(int height) {
// this.height = height;
// }
// public int area() {
// return this.width * this.height;
// }
// }
// public class Square extends Rectangle {
// @Override
// public void setWidth(int width) {
// super.width = width;
// super.height = width;
// }
// @Override
// public void setHeight(int height) {
// super.width = height;
// super.height = height;
// }
// }
// ​
// 5) Переписать код в соответствии с Dependency Inversion Principle:
// public class Car {
// private PetrolEngine engine;
// public Car(PetrolEngine engine) {
// this.engine = engine;
// }
// public void start() {
// this.engine.start();
// }
// }
// public class PetrolEngine {
// public void start() {
// }
// }
// Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

// Формат сдачи: ссылка на гитхаб проект

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}





