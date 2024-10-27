//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100; //остаток на счете
        int add = 1200; // пополнили счет
        int bonus = 0;
        int newBalance = 0;
        if (add > 1000) {
            bonus = add / 100;
            newBalance = balance + add + bonus;
            System.out.println("Вам начислено " + bonus + " бонусных рублей.");
            System.out.println("На вашем счете " + newBalance + " рублей.");
        } else {

            newBalance = balance + add;
            System.out.println("На вашем счете " + newBalance + " рублей.");
        }
    }
}