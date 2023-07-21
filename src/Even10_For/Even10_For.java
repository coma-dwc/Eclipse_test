package Even10_For;

//1～10までの数字のうち、偶数のみを昇順で表示させる(for文)
public class Even10_For {
	public static void main( String[] args ) {
		for ( int i = 1; i <= 10; i++ ) {
			// 偶数の判定
			if ( 0 == ( i % 2 ) )
				System.out.println( i );
		}
	}
}