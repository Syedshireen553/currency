import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Description("Checking one dollar is equal to ten rupees or not . " +
		"Checking ten  rupees is equal to another ten rupees or not")
public class CurrencyConversionTest {
	@Description("Converting rupees currency to dollar currency")


	@Test
	void checkIsTenRupeesEqualToOneDollarOrNot() {
		Currency tenRupees=new Currency(10,"rs");
		Currency oneDollar=new Currency(1,"us");

		assertTrue(tenRupees.equals(oneDollar));

	}
	@Test
	void checkIsOneDollarEqualToTenRupeesOrNot() {
		Currency tenRupees=new Currency(10,"rs");
		Currency oneDollar=new Currency(1.,"us");
		assertTrue(oneDollar.equals(tenRupees));
	}
	@Description("Converting dollar currency to rupees currency")
	@Test
	void checkIsGivenDollarsEqualToGivenRupees() {
		Currency oneDollar=new Currency(1,"us");
		Currency tenRupees=new Currency(10,"rs");
		assertTrue(oneDollar.plus(oneDollar).equals(tenRupees.plus(tenRupees)));
	}
	@Description("Converting rupees currency to dollar currency")
	@Test
	void checkIsGivenRupeesEqualToGivenDollars() {
		Currency oneDollar=new Currency(1,"us");
		Currency tenRupees=new Currency(10,"rs");
		assertTrue(tenRupees.plus(tenRupees).equals(oneDollar.plus(oneDollar)));
	}
}
