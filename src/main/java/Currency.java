public record Currency(double value, String type) {


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Currency currency)) return false;
		if (!this.type.equals(currency.type)) currency = convert(currency);

		return Double.compare(currency.value, value) == 0 && type.equals(currency.type);
	}


	public Currency plus(Currency currency) {
		if(!type.equals(currency.type)) {
			currency=convert(currency);
		}
		double value = currency.value() + value();
		return new Currency(value, currency.type);
	}

	public Currency convert(Currency currency) {
		if (currency.type().equals("rs")) return Rupees.convert(currency, this.type);
		if (currency.type().equals("us")) return Dollars.convert(currency, this.type);
		return currency;
	}


}
