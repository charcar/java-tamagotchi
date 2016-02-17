import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Welcome to the Tamagotchi");
  }

  // @Test
  // public void tamagotchiNameDisplays() {
  //     goTo("http://localhost:4567/");
  //     assertThat(pageSource()).contains("Welcome to the Tamagotchi");
  //     fill("#name").with("Lil Bibby");
  //     submit(".name-create");
  //     assertThat(pageSource()).contains("Lil Bibby");
  // }
}
