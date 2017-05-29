import org.scalatest.FunSuite

import Sample._

/**
  * Used to test Logic in application with no JS dependencies
  *
  * Created by Dorian Thiessen on 2017-05-29.
  */
class SampleTests extends FunSuite {

  test("getText") {
    assert(getText().equals("Hello World!"))
  }

}
