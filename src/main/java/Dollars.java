public class Dollars {
	public static Currency convert(Currency currency, String currencyType) {
		 currencyType = currencyType.toLowerCase();
		if (currencyType.equals("rs")) {
			double value = currency.value()*10;
			return new Currency(value, "rs");
		}
		return currency;
	}
}
