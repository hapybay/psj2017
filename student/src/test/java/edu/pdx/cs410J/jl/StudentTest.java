package edu.pdx.cs410J.jl;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the Student class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements. Yep.
 */
public class StudentTest
{

  @Test
  public void studentNamedPatIsNamedPat() {
    // Tests should be TheGiven, TheWhen and TheThen.
    //  Given a student named Pat
    String name = "Pat";

    // When we new a Student
    Student pat = new Student(name, new ArrayList(), 0.0, "Doesn't matter");

    // then we expect that pat's getname will give us Pat
    assertThat(pat.getName(), equalTo(name));
  }

  @Test
  public void studentNamedPatIsNamedPatDummy() {
    // Tests should be TheGiven, TheWhen and TheThen.
    //  Given a student named Pat
    String name = "Pat";

    // When we new a Student
    Student pat = new Student(name, new ArrayList(), 0.0, "Doesn't matter");

    // then we expect that pat's getname will give us Pat
    assertThat(pat.getName() + "", equalTo(name));
  }

  @Test
  public void studentNamedPatIsNamedPatDummy2() {
    // Tests should be TheGiven, TheWhen and TheThen.
    //  Given a student named Pat
    String name = "Pat";

    // When we new a Student
    Student pat = new Student(name, new ArrayList(), 0.0, "Doesn't matter");

    // then we expect that pat's getname will give us Pat
    assertThat(pat.getName() + "", equalTo(name));
  }


}
