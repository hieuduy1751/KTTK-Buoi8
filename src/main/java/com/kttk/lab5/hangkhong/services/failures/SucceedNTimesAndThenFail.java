package com.kttk.lab5.hangkhong.services.failures;

public class SucceedNTimesAndThenFail implements PotentialFailure {

  int n;
  int successCount;

  public SucceedNTimesAndThenFail(int n) {
    this.n = n;
  }

  @Override
  public void occur() {
    if (successCount < n) {
      successCount++;
      return;
    }
    // throw new FlightServiceException("Error occurred during flight search");
    throw new Error("Error occurred during flight search");
  }
}
