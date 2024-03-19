package com.learning.core.day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class D10P02 {
	public static void main(String[] args) {

    try{

            Scanner scanner = new Scanner(System.in);



            System.out.println("Enter Roll Number:");

            int rollNumber = Integer.parseInt(scanner.nextLine());



            System.out.println("Enter Name:");

            String name = scanner.nextLine();



            System.out.println("Enter Age:");

            int age = Integer.parseInt(scanner.nextLine());



            System.out.println("Enter Address:");

            String address = scanner.nextLine();



            if (rollNumber == 0 || name.isEmpty() || age == 0 || address.isEmpty()) {

                throw new CustomException("None of the fields should be blank");

            }



            Student student = new Student(rollNumber, name, age, address);



            System.out.println("Do you want to write data to file? (yes/no)");

            String answer = scanner.nextLine();



            if (answer.equalsIgnoreCase("yes")) {

                writeToFile(student);

            } else {

                System.out.println("Program terminated.");

            }



        } catch (NumberFormatException e) {

            System.out.println("Age and Roll Number should be numeric.");

        } catch (CustomException e) {

            System.out.println(e.getMessage());

        } catch (IOException e) {

            e.printStackTrace();

        }

    }



    private static void writeToFile(Student student) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);

        objectOutputStream.close();

        fileOutputStream.close();

        System.out.println("Data written to file successfully.");

    }
}
