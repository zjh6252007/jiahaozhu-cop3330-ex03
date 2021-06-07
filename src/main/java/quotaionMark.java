/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */
import java.util.Scanner;

public class quotaionMark {
    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner scan = new Scanner(System.in);
        String quotation = scan.nextLine();
        String quoMark = "\"" + quotation + "\"";
        System.out.println("Who said it?");
        String name = scan.nextLine();
        System.out.println(name + " says," + quoMark);
    }
}
