import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("lil buddy");
    assertEquals("lil buddy", myPet.getName());
    assertEquals(7, myPet.getFoodLevel());
    assertEquals(7, myPet.getSleepLevel());
    assertEquals(7, myPet.getActivityLevel());
  }


}
