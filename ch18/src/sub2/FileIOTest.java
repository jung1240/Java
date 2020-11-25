package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ��¥ : 2020/11/24
 * �̸� : ������
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p496
 */
public class FileIOTest {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\sinue\\OneDrive\\���� ȭ��\\sample.txt";
		String targetPath = "C:\\Users\\sinue\\OneDrive\\���� ȭ��\\sample2.txt";

		try {

			FileInputStream fis = new FileInputStream(filePath);
			FileOutputStream fos = new FileOutputStream(targetPath);
			
			int value = 0;

			while (true) {
				// fis�� ������ �б�
				value = fis.read();

				if (value == -1) {
					// �� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				//char ch = (char) value;
				//System.out.println(ch);
				
				// fos�� ������ ����
				fos.write(value);
				
			}
			
			// ��Ʈ�� ����
			
			fis.close();
			fos.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����...");

	}
}
