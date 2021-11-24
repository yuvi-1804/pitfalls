import java.math.BigDecimal;
class pitfalls {
	int price = 1000;
	

public static void main(String args[]) {
	BigDecimal discountpercent= new BigDecimal("0.9");
	BigDecimal discountedprice= new BigDecimal(price*(1-discountpercent));
	System.out.println(discountedprice);
}
}