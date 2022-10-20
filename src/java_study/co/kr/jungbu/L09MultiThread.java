package java_study.co.kr.jungbu;

import java.time.LocalTime;
import java.util.Scanner;

class Clock implements Runnable {
	// 스레드로 생성할 코드
	@Override
	public void run() {
		while (true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(1000);	
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class L09MultiThread {
	public static void main(String[] args) {
		
		System.out.println("첫 번째");
		System.out.println("두 번째");
		System.out.println("세 번째");
		
		Clock clock = new Clock();
		Thread clockThread = new Thread(clock);  // 스레드를 run()에 작성된 코드로 생성
		clockThread.start();  // start() : 스레드 생성하는 함수
		
		System.out.println("멀티 스레드 환경이면 실행되는 코드");
		Scanner sc = new Scanner(System.in);
		while (true) {
			String list = sc.nextLine();
			System.out.println("당신이 입력한 값: " + list);
		}
		
	}

}
