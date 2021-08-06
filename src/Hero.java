public class Hero {
//    Hero application_tasks for Lesson 16
//    1. Create a new class Hero as shown in the diagram,
//    2.  Create Methods to class Hero (to String, CalculatedLevel(), add get/set methods
//    3. Create 3 heroes as objects and print out information about them in console

//    (1.)
    private String name;
    private String surname;
    private String nickname;
    private int heroId;
    private HeroType heroType;
    private int deedTime;

//    * Methods Argument, non-argument (3.)
//    No Argument constructor
    public Hero () {
        name = "Dogie";
        heroType = HeroType.Hero;
    }

//    Argument constructor (4.):

    public Hero(String name, String surname, String nickname, int heroId, HeroType heroType, int deedTime) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.heroId = heroId;
        this.heroType = heroType;
        this.deedTime = deedTime;
    }
// Method - calculatedLevel()
    public int  calculatedLevel() {

        if (deedTime < 20) {
            return 1;

        } else if (deedTime >= 20 && deedTime <40) {
            return 2;
        } else if (deedTime>=40){
            return 3;
        } else {
            return 0;
        }
    }


//    Methods - To String (5.), Generate -> To String in a free space after arg, non-arg

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", heroId=" + heroId +
                ", heroType=" + heroType +
                ", deedTime=" + deedTime +
                '}';
    }


//    * Create Getters and Setters (2.)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }

    //    For hero type with enum we will allow just two options as losted belom
    enum HeroType{
        Hero,
        Villain
    }

}
