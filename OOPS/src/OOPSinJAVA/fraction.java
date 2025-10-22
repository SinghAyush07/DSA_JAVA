package oopsinJAVA;

public class fraction {
	public static Fraction add(Fraction f1, Fraction f2) {
		int num = f1.num*f2.den + f1.den*f2.num;
		int den = f1.den*f2.den;
		Fraction f3 = new Fraction(num, den);
		return f3;
	}
	public static Fraction sub(Fraction f1, Fraction f2) {
		int num = f1.num*f2.den - f1.den*f2.num;
		int den = f1.den*f2.den;
		Fraction f3 = new Fraction(num, den);
		return f3;
	}
	public static Fraction mul(Fraction f1, Fraction f2) {
		int num = f1.num*f2.num;
		int den = f1.den*f2.den;
		Fraction f3 = new Fraction(num, den);
		return f3;
	}
	public static Fraction div(Fraction f1, Fraction f2) {
		int num = f1.num*f2.den;
		int den = f1.den*f2.num;
		Fraction f3 = new Fraction(num, den);
		return f3;
	}
	public static int gcd (int a, int b) {
		 // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
	}
	public static class Fraction {
		int num;
		int den;
		
		public Fraction (int num, int den) {
			this.num = num;
			this.den = den;
			simplify();
		}
		
		public void simplify() {
			boolean flag = false;
			if (num < 0 && den > 0) {num *= -1;
				flag = true;
			}
			else if (den <0 && num >0) {
				den *= -1;
				flag = true;
			} 
			int hcf = gcd (num, den);

			num /= hcf;
			den /= hcf;
			if (flag == true) num *= -1;
		}
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(35,21);
		System.out.println(f1.num+"/"+f1.den);
		Fraction f2 = new Fraction(7,3);
		System.out.println(f2.num+"/"+f2.den);
		Fraction f3 = add(f1, f2);
		System.out.println(f3.num+"/"+f3.den);
		Fraction f4 = sub(f1, f2);
		System.out.println(f4.num+"/"+f4.den);
		Fraction f5 = mul(f1, f2);
		System.out.println(f5.num+"/"+f5.den);
		Fraction f6 = div(f1, f2);
		System.out.println(f6.num+"/"+f6.den);
	}
}
