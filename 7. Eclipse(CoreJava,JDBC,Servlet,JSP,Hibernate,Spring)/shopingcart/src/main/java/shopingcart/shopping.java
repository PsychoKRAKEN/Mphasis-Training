package shopingcart;

public class shopping {
		private int sum=0;
		public void setProduct(String x)
		{
			sum+=Integer.parseInt(x);
		}

		public String getPrice()
		{
			return Integer.toString(sum);
		}


}
