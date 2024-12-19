/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yixinhuang;

/**
 *
 * @author emhua
 */
public class Account {

    int number;
    int balance;
    String holder;

    public Account(int number, int balance, String holder) {
        this.number = number;
        this.balance = balance;
        this.holder = holder;
    }


    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

}
