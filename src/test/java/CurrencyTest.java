import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CurrencyTest {
	@Test
	void checkingGivenTwoCurrenciesAreEqual() {
		Currency currency=new Currency(10,"rs");
		Currency checkingCurrency=new Currency(10,"rs");
		assertTrue(currency.equals(checkingCurrency));

	}
	@Test
	void checkingGivenTwoCurrenciesAreNotEqual() {
		Currency currency=new Currency(10,"rs");
		Currency checkingCurrency=new Currency(100,"rs");
		assertFalse(currency.equals(checkingCurrency));

	}
@Description("Sum of individual money is equal to prescribed money ")
	@Test
	void checkingGivenMoneyInTotalEqualOrNot() {
	Currency fiveRupees=new Currency(5,"rs");
	Currency fifteenRupees=new Currency(15,"rs");
	Currency tenRupees=new Currency(10,"rs");
	Currency thirtyRupees=new Currency(30,"rs");
	assertTrue(thirtyRupees.equals(fiveRupees.plus(fifteenRupees).plus(tenRupees)));

}
	@Description("Sum of individual money is equal to prescribed money ")
	@Test
	void checkingGivenMoneyInTotalEqualOrNotWhenCurrencyTypesAreDifferent() {
		Currency oneDollar=new Currency(1,"us");
		Currency eightyRupees=new Currency(80,"rs");
		Currency tenRupees=new Currency(10,"rs");
		Currency hundredRupees=new Currency(100,"rs");
		assertTrue(hundredRupees.equals(oneDollar.plus(eightyRupees).plus(tenRupees)));

	}
}
