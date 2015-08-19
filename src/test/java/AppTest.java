import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Square");
      //pageSource means html
  }

  @Test
  public void squareTestIsASquare() {
    goTo("http://localhost:4567/");//going to the home page-indicated by one slash / after server name
    fill("#height").with("5");  //fill the input that has the ID of height with a 5 on home.vtl page
    fill("#width").with("5"); //same as above
    submit(".btn"); //on home.vtl page find type= "submit" with class btn.  The dot signifies "look for a class" Example line...<button type="submit" class="btn">GO!</button>
    assertThat(pageSource()).contains("Your rectangle is a square!");
    //assertThat means "look for", pageSource is html
  }


}
