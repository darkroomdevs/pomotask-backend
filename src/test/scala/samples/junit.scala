package samples

import org.assertj.core.api.Assertions._
import org.junit._

@Test
//noinspection ScalaFileName
class AppTest {

  @Test
  def testOK(): Unit = assertThat(true).isTrue

  @Test
  def testKO(): Unit = assertThat(false).isFalse
}
