package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2020/11/24
 * 이름 : 정유락
 * 내용 : 파일 입출력 스트림 실습하기 교제 p496
 */
public class FileIOTest {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\sinue\\OneDrive\\바탕 화면\\sample.txt";
		String targetPath = "C:\\Users\\sinue\\OneDrive\\바탕 화면\\sample2.txt";

		try {

			FileInputStream fis = new FileInputStream(filePath);
			FileOutputStream fos = new FileOutputStream(targetPath);
			
			int value = 0;

			while (true) {
				// fis로 데이터 읽기
				value = fis.read();

				if (value == -1) {
					// 더 이상 읽을 데이터가 없을 경우
					break;
				}
				//char ch = (char) value;
				//System.out.println(ch);
				
				// fos로 데이터 쓰기
				fos.write(value);
				
			}
			
			// 스트림 해제
			
			fis.close();
			fos.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");

	}
}
