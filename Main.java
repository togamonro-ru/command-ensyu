import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		for(int i=0;i<2;i++){
		System.out.print("�g������͂��Ă��������F");
		double a = s.nextDouble();
		System.out.print("�̏d����͂��Ă��������F");
		double b = s.nextDouble();
		a=a/100;
		double c = b / (a*a);
		System.out.println("���Ȃ���BMI��"+String.format("%.2f",c)+"�ł�");
		}
	}
}
