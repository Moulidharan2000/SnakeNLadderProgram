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
		final int WIN_POSITION = 100;
		
		if(player == 1) {
			System.out.println("Player : "+player);
			System.out.println("Starting Position : "+position+"\n");
			
			while(position <= WIN_POSITION) {

				int dice = 1+randomNum.nextInt(6);
				System.out.println("Dice Number : "+dice+"\n");
				int options = randomNum.nextInt(3);
				
				switch(options) {
					case 1 :
						System.out.println("Player Gets Ladder !!!");
						position = position + dice;
						if(position <= WIN_POSITION) {
							System.out.println("Player Position : "+position+"\n");
						}
						else if(position > WIN_POSITION) {
							position = position - dice;
							System.out.println("Player Position : "+position+"\n");
						}
						else
							System.out.println();
						break;
					
					case 2 :
						position = position - dice;
						System.out.println("Player Bit by Snake Ladder !!!");
						if(position <= 0) {
							position = 0;
							System.out.println("Player Position : "+position+"\n");
						}
						else
							System.out.println("Player Position : "+position+"\n");
						break;
					
					default :
						System.out.println("No Play");
						System.out.println("Player Position : "+position+"\n");
						break;
					}
				if(position == WIN_POSITION) {
					System.out.println("Player 1 Won The Game !!! ");
					break;
				}
				else
					System.out.println("-----------------------------------");
			}
		}
		else
			System.out.println("Play with Single Player!!!");
	}
}
