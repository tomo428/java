
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
		int d3 = 88;
		
		if(d3 <= 100) {
			if(d3 < 20) {
				System.out.println("未成年");
			}else if(d3 == 77) {
				System.out.println("喜寿");
			}else if(d3 == 88) {
				System.out.println("米寿");
			}else {
				System.out.println("成人");
			}
		}
		
//		9時間目
		int e1 = 1;
		
		switch(e1){
		case 0:
			System.out.println("e1は0に等しい");
			break;
		case 1:
			System.out.println("e1は1に等しい");
			break;
		default:
			System.out.println("e1は0でも1でもない");
		}
		
		String e2 = "青";
		
		switch(e2) {
		case "赤":
			System.out.println("赤組です");
			break;
		case "白":
			System.out.println("白組です");
			break;
		default:
			System.out.println("エラーです");
		}
		
//		10時間目
		String[] f1 = new String[3];
		
		f1[0] = "田中";
		f1[1] = "高橋";
		f1[2] = "斎藤";
		System.out.println(f1[0]);
		
		String[] f2 = {"田中", "高橋", "斎藤"};
		System.out.println(f2[0]);
		
		char[] f3 = {'x', 'y', 'z'};
		System.out.println(f3[0]);
		
		int[] f4 = {1, 5, 10};
		System.out.println(f4[0]);
		
		String[] f5 = {"田中", "高橋", "斎藤"};
		
		f5[0] = "加藤";
		
		System.out.println(f5[0]);
		
//		11時間目
		String[][] g1 = {
				{"日本", "タイ"},
				{"アメリカ", "ブラジル"},
				{"フランス", "ロシア"}
		};
		System.out.println(g1[0][1]);
		
		String[][] g2 = new String[3][2];
		
		g2[0][0] = "日本";
		g2[0][1] = "タイ";
		g2[1][0] = "アメリカ";
		g2[1][1] = "ブラジル";
		g2[2][0] = "フランス";
		g2[2][1] = "ロシア";
		
		System.out.println(g2[2][0]);
		
//		12時間目
		for(int h1 = 0; h1 < 3; h1++) {
			System.out.println(h1);
		}
		
		for(int h2 = 10; h2 > 5; h2--) {
			System.out.println(h2);
		}
		
		for(int h3 = 1; h3 < 10; h3+=2) {
			System.out.println(h3);
		}
		
		for (int h4 = 1; h4 <= 5; h4++) {
			System.out.println("★");
		}
		
//		13時間目
		for(int i1 = 1; i1 <= 10; i1++) {
			if(i1 % 2 == 0) {
				System.out.println(i1);
			}
		}
		
		for(int i2 = 0; i2 < 3; i2++) {
			for(int i3 = 1; i3 < 4; i3++){
				System.out.println(i3);
			}
		}
		
		int i4 = 10;
		
		String i5 = i4 > 0 ? "プラス" : "マイナス";
		
		System.out.println(i5);
		
		int i6 = 2;
		
		String i7 = i6 % 2 == 0 ? "偶数" : "奇数";
		
		System.out.println(i7);
		
		for(int i8 = 0; i8 < 5; i8++) {
			String i9 = i8 % 2 == 0 ? "☆" : "★";
			
			System.out.println(i9);
		}
		
//		14時間目
		int j1 = 1;
		
		while(j1 <= 5) {
			System.out.println(j1);
			j1++;
		}
		
		int j2 = 0;
		
		while(j2 < 10) {
			System.out.println(j2);
			j2++;
		}
		
		int j3 = 1;
		
		while(j3 <= 10) {
			System.out.println(j3);
			j3+= 2;
		}
		
		int j4 = 10;
		
		while(j4 >= 1) {
			System.out.println(j4);
			j4-= 3;
		}
		
//		15時間目
		int k1 = 1;
		
		do {
			System.out.println(k1);
			k1--;
		} while(k1 > 1);
		
		int k2 = 0;
		
		do {
			System.out.println(k2);
			k2++;
		} while(k2 < 10);
		
		int k3 = 5;
		
		do {
			System.out.println(k3);
			k3++;
		}while(k3 <10);
		
		int k4 = 5;
		
		do {
			System.out.println(k4);
			k4--;
		}while(k4 > 0);
		
		int k5 = 10;
		
		do {
			System.out.println(k5);
			k5-= 3;
		}while(k5 >= 2);
	}
}