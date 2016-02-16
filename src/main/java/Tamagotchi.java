public class Tamagotchi {
  private final int MAX_FOOD = 10;
  private final int MAX_PLAY = 10;
  private final int MAX_SLEEP = 10;
  private String mName;
  private int mFood;
  private int mPlay;
  private int mSleep;

  public Tamagotchi(String name) {
    mName = name;
    mFood = 7;
    mPlay = 7;
    mSleep = 7;
  }

  public String getName() {
    return mName;
  }

  public int getFoodLevel() {
    return mFood;
  }

  public int getActivityLevel() {
    return mPlay;
  }

  public int getSleepLevel() {
    return mSleep;
  }
}
