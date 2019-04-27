package com.globant.academy.util;

import com.globant.academy.models.Account;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class DataUtil {

    public static void createRandomData() {
        Account account = generateRandomData();
        String fileData = account.getName() + "\n" + account.getLastName() + "\n" + account.getEmail() + "\n" + account.getPassword();
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("logs\\file.txt");
            fos.write(fileData.getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteRandomData() {
        new File("logs\\file.txt").delete();
    }

    private static Account generateRandomData() {
        String name = generateRandomText(6);
        String lastName = generateRandomText(6);
        String email = generateRandomText(6) + "@" + generateRandomText(6) + ".com";
        String password = generatePasswordForESPN();
        return new Account(name, lastName, email, password);
    }

    private static String generateRandomText(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int position = rand.nextInt(chars.length());
            resultado.append(chars.charAt(position));
        }
        return resultado.toString();
    }

    private static String generatePasswordForESPN() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String symbols = "!#$%&/()=?¡;:_[]¨*";
        Random rand = new Random();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int position = rand.nextInt(letters.length());
            resultado.append(letters.charAt(position));
        }
        for (int k = 0; k < 4; k++) {
            int position = rand.nextInt(symbols.length());
            resultado.append(symbols.charAt(position));
        }
        for (int j = 0; j < 4; j++) {
            int position = rand.nextInt(numbers.length());
            resultado.append(numbers.charAt(position));
        }
        return resultado.toString();
    }

    public static Account readRandomData() {
        List<String> allLines;
        try {
            allLines = Files.readAllLines(Paths.get("logs\\file.txt"));
            return new Account(allLines.get(0), allLines.get(1), allLines.get(2), allLines.get(3));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
