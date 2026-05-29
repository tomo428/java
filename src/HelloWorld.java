
public class HelloWorld {

	public static void main(String[] args) {
		// Hello World!の出力
		System.out.println("Hello World!");
		//3時間目
		System.out.println("こんにちは！！");
		System.out.println(123);
		System.out.println("おはよう");
		System.out.println(0);
		System.out.println("例外が発生しました");
		System.out.println("例外が\r\n発生しました");
//		4時間目
		String name = "高橋";
		System.out.println(name);

		String str1 = "鈴木";
		System.out.println(str1);

		String str2 = "Tanaka";
		System.out.println(str2);

		String tel = "090-1234-5678";
		System.out.println(tel);

		char char1 ='A';
		System.out.println(char1);

		int num1 = 12345;
		System.out.println(num1);

		boolean boo = true;
		System.out.println(boo);

		int a = 3+3;
		System.out.println(a);

		String a2 = "3+3";
		System.out.println(a2);

		String abc = "山田";
		System.out.println(abc + "さん");

//		5時間目
		float b1 = 5 / 2;
		System.out.println(b1);

		float b2 = (float)5 / 2;
		System.out.println(b2);

		float b3 = (float)10 / 3;
		System.out.println(b3);

		double b4 = (double)10 / 3;
		System.out.println(b4);

		int b5 = 7 % 3;
		System.out.println(b5);
		
		System.out.println(6 % 3);
		
//		7時間目
		int c1 = 10;
		
		if(c1 < 20) {
			System.out.println("A");
		}
		int c2 = 20;
		
		if(c2 <= 30) {
			System.out.println("B");
		}
		String c3 = "山田";
		
		if(c3.equals("山田")) {
			System.out.println(c3  + "さん");
		}
		
		int c4 = 5;
		
		if(c4 < 10 && 3 < c4) {
			System.out.println("A");
		}
		
		int c5 = 5;
		
		if(c5 >= 5 || c5 <= 0) {
			System.out.println("B");
		}
		
		int c6 = 7;
		
		if(c6 > 8) {
			System.out.println("A");
		}else if(c6 < 10) {
			System.out.println("B");
		}
		
		int c7 = 3;
		
		if(c7 >5) {
			System.out.println("A");
		}else {
			System.out.println("Z");
		}
		
		int c8 = 20;
		
		if(c8 < 8) {
			System.out.println("A");
		}else if(c8 == 8) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		int c9 = 18;
		
		if(c9 >= 20) {
			System.out.println("成人");
		}else {
			System.out.println("未成年");
		}
		
		int c10 = 35;
		
		if(c10 < 20) {
			System.out.println("未成年");
		}else if(c10 < 80) {
			System.out.println("高齢者");
		}else {
			System.out.println("成人");
		}
		
		int c11 = 35;
		
		if(c11 < 20) {
			System.out.println("未成年");
		}else if(c11 >= 20 && c11 <= 80) {
			System.out.println("成人");
		}else {
			System.out.println("高齢者");
		}
		
		int c12 = 5;
		
		if(c12 / 2 == 0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
//		8時間目
		int d1 = 10;
		
		if(d1 > 0) {
			if(d1 == 2){
				System.out.println("A");
			}else if(d1 == 3){
				System.out.println("B");
			}else{
				System.out.println("C");
			}
		}
		
		int d2 = 2;
		
		if(d2 > 0) {
			if(d2 == 2) {
				System.out.println("A");
			}else if(d2 == 3) {
				System.out.println("B");
			}else {
				System.out.println("C");
			}
		}
	}

}