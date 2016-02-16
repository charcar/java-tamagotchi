public class Tamagotchi {
  private final int MAX_FOOD = 10;
  private final int MAX_PLAY = 10;
  private final int MAX_SLEEP = 10;
  private final int MAX_AGE = 30;
  private String mName;
  private int mFood;
  private int mPlay;
  private int mSleep;
  private int mAge;

  public Tamagotchi(String name) {
    mName = name;
    mFood = 7;
    mPlay = 7;
    mSleep = 7;
    mAge = 1;
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
  public int getAge() {
    return mAge;
  }

  public void timePasses() {
    mFood--;
    mPlay--;
    mSleep--;
    mAge++;
  }

  public boolean isAlive() {
    return (mFood > 0 && mPlay > 0 && mSleep > 0 && mAge <= MAX_AGE);
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
  public int setAgeLevel(int newAge) {
    return mAge = newAge;
  }

  public int feed() {
    return setFoodLevel(MAX_FOOD);
  }

  public int play() {
    return setActivityLevel(MAX_PLAY);
  }

  public int sleep() {
    return setSleepLevel(MAX_SLEEP);
  }
}
