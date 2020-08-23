package java_13;

import java.util.Scanner;

public class Elevator extends Lift{
	
	final int maxFloor = 10;
	final int minFloor = -3;
	
	@Override
	void up() {
		floor++;
	}

	@Override
	void down() {
		floor--;
	}

	@Override
	void start(int choice) {
		if(choice < floor) {
			for (int i = 0; i <= floor-choice+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"th floor");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				down();
			}
			stop();
		}else if(choice != floor) {
			for (int i = 0; i <= choice-floor+i ; i++) {
				if(floor!=0) {
					System.out.println(floor+"floor");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				up();
			}
			stop();
		}else {
			System.out.println("The same floor isnt available");
		}
	}

	@Override
	void stop() {
		System.out.println("¡ÜArrived¡Ü");
	}

	@Override
	void go() {
		int choice = 0;
		String msg = "";
		while(true) {
			msg = "Where to go?(current : "+floor+"th floor)";
			System.out.println(msg);
			choice = new Scanner(System.in).nextInt();
			if(choice > maxFloor || choice < minFloor) {
				System.out.println("From B3 to 10 available");
			}else {
				break;
			}
		}
		start(choice);
	}
	
}
