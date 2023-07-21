package EvenNumber_total;

//1～10までに偶数が何個あるか、また偶数の合計はいくつになるか
public class EvenNumber_total {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("1～10までの偶数の合計は" + sum);
		System.out.println("1～10までの偶数の個数は" + cnt);
	}
}