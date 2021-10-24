import java.util.Scanner;
public class MyIO1 {  //1班47号李泽斌
	public static void main(String[] args) {
		System.out.println("输入矿泉水的数量（瓶）");
		Scanner reader=new Scanner(System.in);
		int A=reader.nextInt();
		System.out.println("输入香蕉的重量（千克）");
		double B=reader.nextDouble();
		double C;
		int D;
		System.out.println("商品名称    量（kg/个）   单价（元）  小计（元）");
		System.out.printf("矿泉水      %d             %.2f         %.2f\n",A,2.0,A*2.0);
		System.out.printf("香蕉        %.1f           %.2f         %.2f\n",B,3.8,B*3.8);
		System.out.println("------------------------------------");
		C=A*2+B*3.8;
		D=(int)C;
		System.out.printf("合计（元）                             %.2f\n",C);
		System.out.printf("优惠（元）                             %d",D);
	}	
}