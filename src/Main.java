import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Customer imran = new Customer("imran","matloob",900);
        GUI first = new GUI();
        first.addCustomer(imran);

        System.out.println(imran);
        imran.giveMoney(1000);
        System.out.println(imran);
        imran.takeMoney(1000);
        System.out.println(imran);


    }
}