package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestSearch {
  
  private Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // TODO makeListFixture
  private List<Team> makeArrayListFixture(final int size) {
    final List<Team> list = new Team(size);

  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f
  @Test
  public void testFindPostionList0() {
    final List <Team> list = makeL;
    assertFalse(Search.findTeamPosition(list, "Team 5",) .isPresent());
  }
  
  // TODO: testFindMinFundingArray for several sizes and scenarios

  // TODO: testFindMinFundingArrayFast for several sizes and scenarios
}
