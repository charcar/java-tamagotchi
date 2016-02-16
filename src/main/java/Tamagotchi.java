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

  public void timePasses() {
    mFood--;
    mPlay--;
    mSleep--;
  }

  public boolean isAlive() {
    return (mFood > 0 && mPlay > 0 && mSleep > 0);
  }

  public int setFoodLevel(int newLevel) {
    return mFood = newLevel;
  }
  public int setActivityLevel(int newLevel) {
    return mPlay = newLevel;
  }
  public int setSleepLevel(int newLevel) {
    return mSleep = newLevel;
  }
}
