package com.bridgelabz.snakenladder;

import java.util.Scanner;

public class SnakeNLadder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Player : ");
		int player = scan.nextInt();
		int position = 0;
		if(player == 1) {
			System.out.println("Player : "+player);
			System.out.println("Starting Position : "+position);
		}
		else
			System.out.println("Play with Single Player!!!");
	}

}
