/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		boolean Bool1, Bool2, TF ; int i,j, hsl ;
		float x,y,res;
		/* algoritma */
		System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
		Bool1 = true; Bool2 = false;
		System.out.println (" ");
		System.out.println (TF = Bool1 && Bool2); /* Boolean AND */
		System.out.println (TF = Bool1 || Bool2); /* Boolean OR */
		System.out.println (TF = ! Bool1); /* NOT */
		System.out.println (TF = Bool1 ^Bool2); /* XOR */
		System.out.println (" ");
		/* operasi numerik */
		i = 5; j = 2 ;
		System.out.println (hsl = i+j);
		System.out.println (hsl = i - j);
		System.out.println (hsl = i / j);
		System.out.println (hsl = i * j);
		System.out.println (hsl = i /j) ; /* pembagian bulat */
		System.out.println (hsl = i%j) ; /* sisa. modulo */
		System.out.println (" ");
		/* operasi numerik */
		x = 5 ; y = 5 ;
		System.out.println (res = x + y);
		System.out.println (res = x - y);
		System.out.println (res = x / y);
		System.out.println (res = x * y);
		System.out.println (" ");
		/* operasi relasional numerik */
		System.out.println (TF = (i==j));
		System.out.println (TF = (i!=j));
		System.out.println (TF = (i < j));
		System.out.println (TF = (i > j));
		System.out.println (TF = (i <= j));
		System.out.println (TF = (i >= j));
		System.out.println (" ");
		/* operasi relasional numerik */
		System.out.println (TF = (x != y));
		System.out.println (TF = (x < y));
		System.out.println (TF = (x > y));
		System.out.println (TF = (x <= y));
		System.out.println (TF = (x >= y));
	}
}