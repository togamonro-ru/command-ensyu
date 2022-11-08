import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		for(int i=0;i<2;i++){
		System.out.print("身長を入力してください：");
		double a = s.nextDouble();
		System.out.print("体重を入力してください：");
		double b = s.nextDouble();
		a=a/100;
		double c = b / (a*a);
		System.out.println("あなたのBMIは"+String.format("%.2f",c)+"です");
		}
	}
}
