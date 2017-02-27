package PkgEmpty;

public class MyInteger {
		private int iValue;
		int i;
		
		public MyInteger(int iValue) {
			this.iValue = iValue;
		}
		
		public int getValue() {
			return iValue;
		}

		public boolean isEven() {
			
			if(iValue % 2 ==0)
			{
				return true;
			}
			else
			{
				return false;
			}

		}

		public boolean isOdd() {
			if(iValue % 2 !=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		public boolean isPrime() {
			for (int i = 2; i < iValue; i++) 
			{
				if (iValue % i == 0)
					return false;
			}
			return true;
		}

		public static boolean isEven(int Val) {
			if (Val % 2 == 0)
				return true;
			else
				return false;
		}

		public static boolean isOdd(int Val) {
			{
				if (Val % 2 != 0)
					return true;
				else
					return false;
			}
		}

		public static boolean isPrime(int Val) {
			for (int x =2; x<Val; x++) 
			{
				if (Val % x ==0)
					return false;
			}
			return true;
		}

		public static boolean isEven(MyInteger Val) {
			return Val.isEven();

			
		}

		public static boolean isOdd(MyInteger Val) {
			return Val.isOdd();

		}

		public static boolean isPrime(MyInteger Val) 
		{
			return Val.isPrime();
 
		}

		public boolean equals(int Num) {
			if (Num == iValue)
			{
				return true;
			}
			else
				return false;
		}

		public boolean equals(MyInteger Val) 
		{
			return Val.equals(Val.getValue());
	
		}
		
		}
