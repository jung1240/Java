package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ��¥ : 2020/11/24
 * �̸� : ������
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p496
 */
public class BufferedStreamTest {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\sinue\\OneDrive\\���� ȭ��\\sample.jpg";
		String targetPath = "C:\\Users\\sinue\\OneDrive\\���� ȭ��\\sample2.jpg";

		try {
			// ���ϰ� �Է½�Ʈ�� ����
			FileInputStream fis = new FileInputStream(filePath);
			FileOutputStream fos = new FileOutputStream(targetPath);
			
			// ���۽�Ʈ�� ���� ����
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			
			
			int value = 0;

			while (true) {
				// fis�� ������ �б�
				value = bis.read();

				if (value == -1) {
					// �� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				//char ch = (char) value;
				//System.out.println(ch);
				
				// fos�� ������ ����
				bos.write(value);
				
			}
			
			// ��Ʈ�� ����
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����...");

	}
}
