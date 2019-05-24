package com.example.demo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by kasparmetsa on 24.05.19.
 */
public class AccountTest {
  private Account account;


  @Before
  public void before() {
    account = new Account();
  }

  @Test
  public void given20AndMin10_whenWithdraw5_thenSuccess() throws Exception {
    assertTrue(account.withdraw(5));
  }

  @Test
  public void given20AndMin10_whenWithdraw100_thenFail() throws Exception{
    assertFalse(account.withdraw(100));
  }
}