package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAvg_2and3_ret5() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 10e-9);
  }

  @Test
  public void testSumRange() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumRange(1, 10));
  }

  @Test
  public void testAvgRange() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.avgRange(1, 10), 10e-9);
  }

  @Test
  public void testOddSum_1to10_expect25() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.oddSum(1, 10));
  }

  @Test
  public void testOddSum_2to10_expect24() {
    Calculate calculate = new Calculate();
    int expected = 24;
    assertEquals(expected, calculate.oddSum(2, 10));
  }

  @Test
  public void testOddSum_2to9_expect24() {
    Calculate calculate = new Calculate();
    int expected = 24;
    assertEquals(expected, calculate.oddSum(2, 9));
  }

  @Test
  public void testOddSum_1to9_expect25() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.oddSum(1, 9));
  }

  @Test
  public void testEvenSum_1to9_expect20() {
    Calculate calculate = new Calculate();
    int expected = 20;
    assertEquals(expected, calculate.evenSum(1, 9));
  }

  @Test
  public void testEvenSum_2to9_expect20() {
    Calculate calculate = new Calculate();
    int expected = 20;
    assertEquals(expected, calculate.evenSum(1, 9));
  }

  @Test
  public void testEvenSum_2to10_expect30() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.evenSum(2, 10));
  }

  @Test
  public void testEvenSum_1to10_expect30() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.evenSum(1, 10));
  }
}
