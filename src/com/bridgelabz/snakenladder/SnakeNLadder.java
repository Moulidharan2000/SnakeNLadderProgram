package com.bridgelabz.snakenladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeNLadder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random randomNum = new Random();
		System.out.print("Enter the Number of Player : ");
		int player = scan.nextInt();
		int position = 0;
		
		if(player == 1) {
			int dice = 1+randomNum.nextInt(6);
			System.out.println("Player : "+player);
			System.out.println("Starting Position : "+position);
			System.out.println("Dice Number : "+dice);
			
			int options = randomNum.nextInt(3);
			
			switch(options) {
				case 1 :
					System.out.println("Player Gets Ladder !!!");
					System.out.println("Player Position : "+(position+dice));
					break;
				
				case 2 :
					System.out.println("Player Bit by Snake Ladder !!!");
					System.out.println("Player Position : "+(position-dice));
					break;
				
				default :
					System.out.println("No Play");
					System.out.println("Player Position : "+position);
					break;
			}
		}
		else
			System.out.println("Play with Single Player!!!");
	}
}
