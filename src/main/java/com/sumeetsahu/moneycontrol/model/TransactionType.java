package com.sumeetsahu.moneycontrol.model;

public enum TransactionType {
  BUY,
  SELL;

  public String value() {
    return this == BUY ? "Buy" : "Sell";
  }
}
