package students.anna_tim.lesson_3.level_3.task_12;

public class Robot {
    //в этом свойстве наш виртуальный обьект робот будет запоминать своё имя.
    String name;

    // Это конструктор класса. У этого конструктора один параметр с названием name и типом String.
    // То есть при создании робота в его конструктор будут передавать название робота.
    public Robot(String robotName) {
      this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is ROBO");
    }
}