package school;


//�б�
public class ClassRoom {
	 
	static int �б������ο� =0;//��ü ��ü���� ������ �ϰڴ�.
	int �����ο�;//�� ��ü�� �����ϴ� �Ӽ�
	int �����ο�;//�� ��ü�� �����ϴ� �Ӽ�(100���� 100���� �����ο��� ����)
	
	public ClassRoom() {
		�б������ο� = 0;
		�����ο� = 30;
		�����ο� = 0;
	}

	
	public void ����() {
		�б������ο� ++;
		�����ο� ++;
		�����ο� --;
		
	}
	
	public void ����() {
		�б������ο� --;
		�����ο� --;
		�����ο� ++;
	}
		
		public void printMe() {
			
			System.out.println("----------------------");
			System.out.println("�����ο� : " + �����ο� );
			System.out.println("�����ο� : " + �����ο� );
			System.out.println("�б������ο� : " + �б������ο� );//��ü����
		}
		
		
		public static void printMe2() {
			System.out.println("======static=======");
			
			
		}
		
		
		
	}
	

