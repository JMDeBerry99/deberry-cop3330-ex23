/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class TroubleshootingCarIssues
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String answer = in.nextLine();
        if(answer.equalsIgnoreCase("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            answer = in.nextLine();
            if(answer.equalsIgnoreCase("y"))
            {
                System.out.println("Clean the terminals and try starting again.");
                return;
            }
            else
            {
                System.out.println("Replace cables and try again.");
                return;
            }
        }
        else
        {
            System.out.print("Does the car make a clicking noise? ");
            answer = in.nextLine();
            if(answer.equalsIgnoreCase("y"))
            {
                System.out.println("Replace the battery.");
                return;
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                answer = in.nextLine();
                if(answer.equalsIgnoreCase("y"))
                {
                    System.out.println("Check spark plug connections.");
                    return;
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    answer = in.nextLine();
                    if(answer.equalsIgnoreCase("y"))
                    {
                        System.out.print("Does your car have fuel injection? ");
                        answer = in.nextLine();
                        if(answer.equalsIgnoreCase("y"))
                        {
                            System.out.println("You need to take the car in for service.");
                            return;
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}
