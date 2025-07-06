package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(double x, double y) {
    return (x + y) / 2;
  }

  public int sumRange(int x, int y) {
    int left = Math.min(x, y);
    int right = Math.max(x, y);
    double second = (right - left + 1) / 2.0;
    return (int) ((left + right) * second);
  }

  public double avgRange(int x, int y) {
    int left = Math.min(x, y);
    int right = Math.max(x, y);
    return (double) sumRange(left, right) / (right - left + 1);

  }

  public int oddSum(int x, int y) {
    int left = Math.min(x, y);
    int right = Math.max(x, y);
    if (left % 2 == 1) {
      if (right % 2 == 1)
        return sumRange(left, left + ((right - left) / 2)) + sumRange(1, ((right - left) / 2));
      else
        return oddSum(left, right - 1);
    } else {
      if (right % 2 == 1)
        return oddSum(left + 1, right);
      else
        return oddSum(left + 1, right - 1);
    }

  }

  public int evenSum(int x, int y) {
    int left = Math.min(x, y);
    int right = Math.max(x, y);
    if (left % 2 == 1) {
      if (right % 2 == 1)
        return evenSum(left + 1, right - 1);
      else
        return evenSum(left + 1, right);
    } else {
      if (right % 2 == 1)
        return evenSum(left, right - 1);
      else
        return sumRange(left, left + (right - left) / 2) + sumRange(1, ((right - left) / 2));
    }
  }
}
