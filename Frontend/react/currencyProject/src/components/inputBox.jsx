import React from "react";

function inputBox(
  label,
  amount,
  onAmountChange,
  onCurrencyChange,
  currencyOptions = [],
  selectedcurrency = "usd",
  amountDisabled = false,
  currencyDisabled = false,
  className = ""
) {
  return (
    <div className={`bg-white p-3 rounded-lg text-sm flex ${className}`}>
      <div className="w-1-2">
        <label className="text-black/40 mb-2 inline block">{label}</label>
        <input
          type="number"
          className="outline-none w-full bg-transparent py-1.5"
          placeholder="Amount"
        />
      </div>
    </div>
  );
}

export default inputBox;
