package com.bridgelabz.snakenladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeNLadder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random randomNum = new Random();
		System.out.print("Enter the Number of Player : ");
		int players = scan.nextInt();
		int player1Position = 0;
		int player2Position = 0;
		final int WIN_POSITION = 100;
		int dieRoll1 = 0;
		int dieRoll2 = 0;
		
		if(players == 2) {

			System.out.println("Player 1 Starting Position : "+player1Position+"\n");
			System.out.println("Player 2 Starting Position : "+player2Position+"\n");
			
			while(player1Position <= WIN_POSITION && player2Position <= WIN_POSITION) {

				int dice1 = 1+randomNum.nextInt(6);
				System.out.println("Dice 1 Number : "+dice1+"\n");
				int options1 = randomNum.nextInt(3);
				dieRoll1 ++;
				
				switch(options1) {
					case 1 :
						System.out.println("Player 1 Gets Ladder !!!");
						player1Position = player1Position + dice1;
						if(player1Position <= WIN_POSITION) {
							System.out.println("Player 1 Position : "+player1Position+"\n");
						}
						else if(player1Position > WIN_POSITION) {
							player1Position = player1Position - dice1;
							System.out.println("Player 1 Position : "+player1Position+"\n");
						}
						else
							System.out.println();
						break;
					
					case 2 :
						player1Position = player1Position - dice1;
						System.out.println("Player 1 Bit by Snake Ladder !!!");
						if(player1Position <= 0) {
							player1Position = 0;
							System.out.println("Player 1 Position : "+player1Position+"\n");
						}
						else
							System.out.println("Player 1 Position : "+player1Position+"\n");
						break;
					
					default :
						System.out.println("Player 1 Has No Play");
						System.out.println("Player 1 Position : "+player1Position+"\n");
						break;
					}
				System.out.println("Dice 1 Rolled : "+dieRoll1+" Times \n");
				if(player1Position == WIN_POSITION) {
			
					System.out.println("Player 1 Won The Game !!! ");
					break;
				}
				else
					System.out.println("-----------------------------------");
				
				
				int dice2 = 1+randomNum.nextInt(6);
				System.out.println("Dice 2 Number : "+dice2+"\n");
				int options2 = randomNum.nextInt(3);
				dieRoll2 ++;
				
				switch(options2) {
					case 1 :
						System.out.println("Player 2 Gets Ladder !!!");
						player2Position = player2Position + dice2;
						if(player2Position <= WIN_POSITION) {
							System.out.println("Player 2 Position : "+player2Position+"\n");
						}
						else if(player2Position > WIN_POSITION) {
							player2Position = player2Position - dice2;
							System.out.println("Player 2 Position : "+player2Position+"\n");
						}
						else
							System.out.println();
						break;
					
					case 2 :
						player2Position = player2Position - dice2;
						System.out.println("Player 2 Bit by Snake Ladder !!!");
						if(player2Position <= 0) {
							player2Position = 0;
							System.out.println("Player 2 Position : "+player2Position+"\n");
						}
						else
							System.out.println("Player 2 Position : "+player2Position+"\n");
						break;
					
					default :
						System.out.println("Player 2 Has No Play");
						System.out.println("Player 2 Position : "+player2Position+"\n");
						break;
					}
				System.out.println("Dice 2 Rolled : "+dieRoll2+" Times \n");
				if(player2Position == WIN_POSITION) {
					
					System.out.println("Player 2 Won The Game !!! ");
					break;
				}
				else
					System.out.println("-----------------------------------");
				
			}
		}
		else
			System.out.println("Play with Two Players !!!");
	}
}
