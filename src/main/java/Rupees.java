public class Rupees {
	public static Currency convert(Currency currency, String currencyType) {
		 currencyType = currencyType.toLowerCase();
			if (currencyType.equals("us")) {
				double value =  currency.value()*0.1;

				return new Currency(value, "us");
			}
		return currency;
	}

}
