package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? : ");
		int nRents = sc.nextInt();
		Product[] rent = new Product[nRents];
		Product[] roomS = new Product[10];

		if (rent.length <= 10) {
			for (int x = 0; x < rent.length; x++) {
				sc.nextLine();
				System.out.println();
				System.out.println("Rent #" + (x + 1) + " :");
				System.out.printf("Name: ");
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt();
				rent[x] = new Product(name, room, email);
				if (rent[x].getRoom() <= 9) {
					for (int z = 0; z <= x; z++) {
						switch (z) {
						case 1:
							while (rent[0].getRoom() == rent[1].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[1].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						case 2:
							while (rent[1].getRoom() == rent[2].getRoom() || rent[0].getRoom() == rent[2].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[2].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						case 3:
							while (rent[0].getRoom() == rent[3].getRoom() || rent[1].getRoom() == rent[3].getRoom()
									|| rent[2].getRoom() == rent[3].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[3].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						case 4:
							while (rent[0].getRoom() == rent[4].getRoom() || rent[1].getRoom() == rent[4].getRoom()
									|| rent[2].getRoom() == rent[4].getRoom()
									|| rent[3].getRoom() == rent[4].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[4].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						case 5:
							while (rent[0].getRoom() == rent[5].getRoom() || rent[1].getRoom() == rent[5].getRoom()
									|| rent[2].getRoom() == rent[5].getRoom() || rent[3].getRoom() == rent[5].getRoom()
									|| rent[4].getRoom() == rent[5].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[5].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						case 6:
							while (rent[0].getRoom() == rent[6].getRoom() || rent[1].getRoom() == rent[6].getRoom()
									|| rent[2].getRoom() == rent[6].getRoom() || rent[3].getRoom() == rent[6].getRoom()
									|| rent[4].getRoom() == rent[6].getRoom()
									|| rent[5].getRoom() == rent[6].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[6].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						case 7:
							while (rent[0].getRoom() == rent[7].getRoom() || rent[1].getRoom() == rent[7].getRoom()
									|| rent[2].getRoom() == rent[7].getRoom() || rent[3].getRoom() == rent[7].getRoom()
									|| rent[4].getRoom() == rent[7].getRoom() || rent[5].getRoom() == rent[7].getRoom()
									|| rent[6].getRoom() == rent[7].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[7].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						case 8:
							while (rent[0].getRoom() == rent[8].getRoom() || rent[1].getRoom() == rent[8].getRoom()
									|| rent[2].getRoom() == rent[8].getRoom() || rent[3].getRoom() == rent[8].getRoom()
									|| rent[4].getRoom() == rent[8].getRoom() || rent[5].getRoom() == rent[8].getRoom()
									|| rent[6].getRoom() == rent[8].getRoom()
									|| rent[7].getRoom() == rent[8].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[8].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						case 9:
							while (rent[0].getRoom() == rent[9].getRoom() || rent[1].getRoom() == rent[9].getRoom()
									|| rent[2].getRoom() == rent[9].getRoom() || rent[3].getRoom() == rent[9].getRoom()
									|| rent[4].getRoom() == rent[9].getRoom() || rent[5].getRoom() == rent[9].getRoom()
									|| rent[6].getRoom() == rent[9].getRoom() || rent[7].getRoom() == rent[9].getRoom()
									|| rent[8].getRoom() == rent[9].getRoom()) {
								System.out.printf("The room %d was already rented, please, choose another one: ",
										rent[9].getRoom());
								room = sc.nextInt();
								rent[x] = new Product(name, room, email);
							}
							break;
						}
					}
				} else {
					System.out.print("Choose a room between 0 and 9: ");
					room = sc.nextInt();
					rent[x] = new Product(name, room, email);
				}
			}
		}
		for (int x = 0; x < rent.length; x++) {
			int c = rent[x].getRoom();
			String name = rent[x].getName();
			String email = rent[x].getEmail();
			int room = rent[x].getRoom();
			roomS[c] = new Product(name, room, email);
		}

		System.out.print("Busy rooms: ");
		for (int w = 0; w < 10; w++) {
			if (roomS[w] != null) {
				System.out.printf("%nRoom %d: %s, %s%n", roomS[w].getRoom(), roomS[w].getName(), roomS[w].getEmail());
			}
		}
		System.out.println((10 - rent.length) + " rooms available");
		
		/*System.out.print("Do you wanna add more people?: ");
		char dec = sc.next().charAt(0);
		if(dec == 'y') {
		}*/
		
		String a = Integer.toString(rent[0].getRoom());
		System.out.println(a);
		
		sc.close();
	}
}