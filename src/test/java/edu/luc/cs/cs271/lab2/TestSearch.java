package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // TODO makeListFixture
  ArrayList<Team> makeListFixture(final int size) {
    ArrayList<Team> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++){
      final String s = Integer.toString(i);
      list.add(new Team("Team " +s, "Coach " + s, i *100 + 50));
    }
    return list;
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
  
  // Finish this
  @Test
  public void testFindPositionList0(){
    final ArrayList list = makeListFixture(0);
  }
  @Test
  public void testFindPositionList10s() {
    final ArrayList list = makeListFixture(10);
  }
  @Test
  public void testFindPositionList10f() {
    final ArrayList list = makeListFixture(10);
  }
  



  @Test
  public void testFindMinFundingArray() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFunding(arr, 500).isPresent());
  }



  @Test
  public void testFindMinFundingArrayFast() {
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFunding(arr, 500).isPresent());
  }

}
