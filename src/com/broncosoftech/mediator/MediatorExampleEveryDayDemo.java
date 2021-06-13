package com.broncosoftech.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorExampleEveryDayDemo {

	private Timer timer;

	public MediatorExampleEveryDayDemo(int seconds) {
		this.timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
		timer.schedule(new RemindTaskFinal(), (seconds + 2) * 1000);
	}

	class RemindTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("Time's up...");
		}
	}

	class RemindTaskFinal extends TimerTask {
		@Override
		public void run() {
			System.out.println("Now time's really up...");
			timer.cancel();
		}
	}

	public static void main(String[] args) {
		System.out.println("Scheduing meeting...");
		MediatorExampleEveryDayDemo demo = new MediatorExampleEveryDayDemo(2);
		System.out.println("Scheduled the meet...");
	}

}
