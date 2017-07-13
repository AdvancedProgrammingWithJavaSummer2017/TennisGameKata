package edu.pdx.cs410J.tennis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for the {@link TennisGame} class.
 */
public class TennisGameTest {
  
  @Test(expected = UnsupportedOperationException.class)
  public void getArrivalStringNeedsToBeImplemented() {
    TennisGame flight = new TennisGame();
    flight.getArrivalString();
  }

  @Test
  public void initiallyAllFlightsHaveTheSameNumber() {
    TennisGame flight = new TennisGame();
    assertThat(flight.getNumber(), equalTo(42));
  }

  @Test
  public void forProject1ItIsOkayIfGetDepartureTimeReturnsNull() {
    TennisGame flight = new TennisGame();
    assertThat(flight.getDeparture(), is(nullValue()));
  }
  
}
