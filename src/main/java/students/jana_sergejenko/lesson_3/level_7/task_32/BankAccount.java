package students.jana_sergejenko.lesson_3.level_7.task_32;

class BankAccount {

    String owner;
    int money=0;
    String money1;


    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money=money;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        String money1=String.valueOf(money);
        return money1;
    }
}
