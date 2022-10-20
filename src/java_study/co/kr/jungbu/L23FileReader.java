package java_study.co.kr.jungbu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L23FileReader {

	public static void main(String[] args) {
		
		try(
		FileReader fr = new FileReader("newFile.txt");  // 문자열로 작성된 파일을 불러오는 객체
		BufferedReader br = new BufferedReader(fr);
		){
			String line = null;
			while ((line=br.readLine()) !=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
