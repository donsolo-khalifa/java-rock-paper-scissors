package somin;

import java.util.Random;
import java.util.Scanner;

public class Rock {
	public String toString(int num) {
		if (num == 1) {
			return "rock";
		} else if (num == 2) {
			return "paper";
		} else
			return "scissors";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 for rock 2 for paper 3 for scissors
		 */
		Rock rock = new Rock();
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("choose:1 for rock 2 for paper 3 for scissors");
		int options = scan.nextInt();
		int comp = 1 + rand.nextInt(3);

		/*
		 * String toString(comp) { switch (comp) { case 1: { return "rock";
		 * 
		 * 
		 * } default: throw new IllegalArgumentException("Unexpected value: " + comp); }
		 * 
		 * }
		 */
		if (comp != options) {
			System.out.println("computer chose " + rock.toString(comp));
			if (comp == 1 && options == 3) {
				System.out.println("you lost : computer chose " +rock.toString(comp));
			} else if (comp == 2 && options == 1) {
				System.out.println("you lost : computer chose "+rock.toString(comp));
			} else if (comp == 3 && options == 2) {
				System.out.println("you lost : computer chose "+rock.toString(comp));
			} else {
				System.out.println("you won ");
			}

		} else {

			System.out.println("both you and computer chose "+rock.toString(comp));

		}
		scan.close();

	}

}
