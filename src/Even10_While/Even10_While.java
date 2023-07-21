package Even10_While;

//1～10までの数字のうち、偶数のみを昇順で表示させる(While文)
public class Even10_While {
	public static void main( String[] args) {
		int i = 1;
		while (10 >= i) {
			//偶数の判定
			if(0 == (i % 2))
				System.out.println(i);
			//iに1を足していく
			i++;
		}
	}
}