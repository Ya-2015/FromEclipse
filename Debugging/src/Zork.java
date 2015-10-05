import java.util.Scanner;

public class Zork {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int EXIT_GAME = 0;
		final int ROOM_1 = 1;
		final int ROOM_2 = 2;
		final int ROOM_3 = 3;
		final int ROOM_4 = 4;
		final int ROOM_5 = 5;
		final int ROOM_6 = 6;
		final int ROOM_7 = 7;
		
		System.out.println("Choose a room to start: 1 - 7");
		int roomNumber = 1;
		roomNumber = scan.nextInt();
		
		if (roomNumber < ROOM_1 || roomNumber > 7){
			System.out.println("Game Exits, as the room number has to be 1 - 7");
		}
		else{
		while(roomNumber!= EXIT_GAME){
			switch(roomNumber){
			case ROOM_1:
				System.out.println("You are standing in a foyer. \nYou see a dead scorpion.\n{You can (2)exit to the north, (0)end the game}");
				roomNumber = scan.nextInt();
				while(roomNumber != ROOM_2 && roomNumber !=EXIT_GAME){
					System.out.println("Wrong room number, please use the correct room number. \n{You can (2)exit to the north, (0)end the game}");
					roomNumber = scan.nextInt();
				}
				break;
			case ROOM_2:
				System.out.println("You are standing in a front room. \nYou see a piano. \n{You can (1)exit to the south, (3)exit to the west, (4)exit to the east, (0)end the game}");
				roomNumber = scan.nextInt();
				while(roomNumber != ROOM_1 && roomNumber != ROOM_3 && roomNumber != ROOM_4 && roomNumber !=EXIT_GAME){
					System.out.println("Wrong room number, please use the correct room number. \n{{You can (1)exit to the south, (3)exit to the west, (4)exit to the east, (0)end the game}");
					roomNumber = scan.nextInt();
				}
				break;
			case ROOM_3:
				System.out.println("You are standing in a library. \nYou see spiders. \n{You can (2)exit to the east. (5)exit to the north, (0)end the game}");
				roomNumber = scan.nextInt();
				while(roomNumber != ROOM_2 && roomNumber != ROOM_5 && roomNumber !=EXIT_GAME){
					System.out.println("Wrong room number, please use the correct room number. \n{You can (2)exit to the east. (5)exit to the north, (0)end the game}");
					roomNumber = scan.nextInt();
				}
				break;
			case ROOM_4:
				System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (2)exit to the west, (7)exit to the north, (0)end the game}");
				roomNumber = scan.nextInt();
				while(roomNumber != ROOM_2 && roomNumber != ROOM_7 && roomNumber !=EXIT_GAME){
					System.out.println("Wrong room number, please use the correct room number. \n{You can (2)exit to the west, (7)exit to the north, (0)end the game}");
					roomNumber = scan.nextInt();
				}
				break;
			case ROOM_5:
				System.out.println("You are standing in a dining room. \nYou see dust and an empty box. \n{You can (3)exit to the south, (0)end the game}");
				roomNumber = scan.nextInt();
				while(roomNumber != ROOM_3 && roomNumber !=EXIT_GAME){
					System.out.println("Wrong room number, please use the correct room number. \n{You can (3)exit to the south, (0)end the game}");
					roomNumber = scan.nextInt();
				}
				break;
			case ROOM_6:
				System.out.println("You are standing in a valut. \nYou see 3 walking skeletons. \n{You can (7)exit to the east, (0)end the game}");
				roomNumber = scan.nextInt();
				while(roomNumber != ROOM_7 && roomNumber !=EXIT_GAME){
					System.out.println("Wrong room number, please use the correct room number. \n{You can (7)exit to the east, (0)end the game}");
					roomNumber = scan.nextInt();
				}
				break;
			case ROOM_7:
				System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (6)exit to the west, (4)exit to the south, (0)end the game}");
				roomNumber = scan.nextInt();
				while(roomNumber != ROOM_6 && roomNumber != ROOM_4 && roomNumber !=EXIT_GAME){
					System.out.println("Wrong room number, please use the correct room number. \n{You can (6)exit to the west, (4)exit to the south, (0)end the game}");
					roomNumber = scan.nextInt();
				}
				break;
			default:
				break;	
			}

			
		}
		if (roomNumber == EXIT_GAME){
			System.out.println("Game Exits");
		}
		}
			
	}
}
