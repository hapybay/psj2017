package edu.pdx.cs410J.jl;

import org.junit.Before;
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

    private Student getStudentNamed(String name) {
        return new Student(name, new ArrayList(), 0.0, "Doesn't matter");
    }

  @Test
  public void studentNamedPatIsNamedPat() {
    // Tests should be TheGiven, TheWhen and TheThen.
      // TheGiven a student named Pat
      // TheWhen we new a Student

      // TheThen we expect that pat's getname will give us Pat
      Student student = getStudentNamed("Pat");
      assertThat(student.getName(), equalTo("Pat"));
  }

  @Test
  public void studentSaysThisClassIsTooMuchWork() {
      Student student = getStudentNamed("Name");
      assertThat(student.says(), equalTo("This class is too much work"));
  }
}