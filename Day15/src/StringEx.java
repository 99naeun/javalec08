
public class StringEx {

	public static void main(String args[]) {
		
		String a = "������";
		a = a + "����";
		
		//string interpolation(ġȯ, �߰��� �� �ֱ�)
		String val = "�ȳ��ϼ���, �� �̸��� %s�Դϴ�. ���̴� %d���̿���.";
		val = String.format(val, "������", 10);
		System.out.println(val);
		
		//StringBuffer, StringBuilder
		//StringBugger Thread-Safe
		//StirngBuilder Thread-unSafe
		
		String name = new String("������");//"������"
		StringBuffer nameBuff = new StringBuffer("������");
		StringBuilder nameBuild = new StringBuilder("������");
		
		name = name + "����";
		nameBuff.append("����");
		nameBuild.append("����");
		
		System.out.println("String : "+name);
		System.out.println("StringBuffer : "+nameBuff);
		System.out.println("StringBuilder : "+nameBuild);
		
		//���ڿ��� ����������/ ������ ���������� ������
		//StringBuilder > StringBuffer >>> 4������ �� >>> String
	}
}
