import java.util.Scanner;
public class MyIO1 {  //1��47�������
	public static void main(String[] args) {
		System.out.println("�����Ȫˮ��������ƿ��");
		Scanner reader=new Scanner(System.in);
		int A=reader.nextInt();
		System.out.println("�����㽶��������ǧ�ˣ�");
		double B=reader.nextDouble();
		double C;
		int D;
		System.out.println("��Ʒ����    ����kg/����   ���ۣ�Ԫ��  С�ƣ�Ԫ��");
		System.out.printf("��Ȫˮ      %d             %.2f         %.2f\n",A,2.0,A*2.0);
		System.out.printf("�㽶        %.1f           %.2f         %.2f\n",B,3.8,B*3.8);
		System.out.println("------------------------------------");
		C=A*2+B*3.8;
		D=(int)C;
		System.out.printf("�ϼƣ�Ԫ��                             %.2f\n",C);
		System.out.printf("�Żݣ�Ԫ��                             %d",D);
	}	
}