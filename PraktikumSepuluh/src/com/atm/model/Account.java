package com.atm.model;

import java.util.Scanner;

public class Account {

    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }

    // Method to change PIN
    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan PIN lama : ");
        String PINlama = scanner.nextLine();
        System.out.print("Masukan PIN baru: ");
        String PINbaru = scanner.nextLine();
        System.out.print("Konfirmasi PIN baru: ");
        String PINkonfirmasi = scanner.nextLine();

        if (!PINbaru.equals(PINkonfirmasi)) {
            System.out.println("PIN baru tidak cocok");
            System.out.println("Silahkan Konfirmasi PIN kembali");
            System.out.print("Konfirmasi PIN baru: ");
            PINkonfirmasi = scanner.nextLine();
        }

        this.pin = PINbaru;
        System.out.println("PIN berhasil diperbarui!!!");

        System.out.println("\nSilahkan Login ulang");
        System.out.print("Masukkan Nomor Akun: ");
        String Akunbaru = scanner.nextLine();
        System.out.print("Masukkan PIN: ");
        String confirmPin = scanner.nextLine();

        if (Akunbaru.equals(this.accountNumber) && confirmPin.equals(PINbaru)) {
            System.out.println("\nVerifikasi berhasil, lanjutkan transaksi");
        } else {
            System.out.println("\nVerifikasi gagal!");
            while (!confirmPin.equals(PINbaru)) {
                System.out.println("\nMaaf, PIN yang Anda masukkan tidak valid!");
                System.out.print("Masukkan PIN yang baru: ");
                confirmPin = scanner.nextLine();
            }
        }
    }
}
