/*　2024.11.20 ハイアンドロー作成
 * 良かったところ　MAth.randomを知った。
 * 　　　　　　　　まず他の人のやつを見た後に、もう見ないで、自分でつくってみた
 * 今後の改善点　間違った文字を入れた時に修正するif文が書けなかった
 * 　　　　　　　親と子が同じ数字が出ないようにする方法が分からない
 * 　　　　　　　こんごはfor文などを使いながら、４ゲームくらい連続でできるようにしたい */



import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		//最初のゲーム画面
		System.out.println("=========================================");
		System.out.println("");
		System.out.println("n(>A<)nようこそ！ハイ＆ローで勝負しよう！！");
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("");
		System.out.println("勝負は簡単！");
		System.out.println("自分の数字が相手より低いか高いか予想するゲームだよ！");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("自分の数字は見れないけど、相手の数字は見れるよ！");
		System.out.println("数字は1～13の中で、自分と相手に1枚ずつ配られるよ！");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		
		//親の数字を見せる場面	
		int parentNumber = (int)(Math.random() * 13) + 1;	
		int childNumber = (int)(Math.random() * 13) + 1;	
		
		System.out.print("相手の数字はこれです：　");
		System.out.println(parentNumber);		
		System.out.println("");
		
		//H＆Lを宣言させる
		System.out.println("自分の数字が相手より高いと思ったら「h]");
		System.out.println("自分の数字が相手より低いと思ったら「l]");
		System.out.println("と書いてね！");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		String thinks = sc.next();
	
		
		System.out.println("あなたは" + thinks + "と選びました");
		
		String result = null;
		
		if (parentNumber < childNumber) {
			result = "h";
		}else if(parentNumber > childNumber) {
			result = "l";
		}else {
			result = null;
		}
		
		System.out.println("=========================================");
		
		System.out.print("あなたの数字はこれです：　");
		System.out.println(childNumber);		
		System.out.println("");
		
		if (result.equals(thinks) ) {
			System.out.println("あなたの勝ちです！");			
		}else{
			System.out.println("あなたの負けです！");	
		}
	}

}
