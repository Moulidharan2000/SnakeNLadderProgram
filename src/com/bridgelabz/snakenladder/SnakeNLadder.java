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
		}
		else
			System.out.println("Play with Single Player!!!");
	}
}
