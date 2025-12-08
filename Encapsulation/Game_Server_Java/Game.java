class Game{
    private String playerName;
    private int level;
    private double experiencePoints;
    private int health;
    private boolean isAlive;

    //will add constructors shortly
    /*
    public Game(String playerName, int level, double experiencePoints, int health, boolean isAlive) {
        this.playerName = playerName;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.health = health;
        this.isAlive = isAlive;
    }

    */
  
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level=level;

    }
    public double getExperiencePoints(){
        return experiencePoints;
    }
    public void setExperiencePoints(double experiencePoints){
        this.experiencePoints=experiencePoints;

    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=health;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setIsAlive(boolean isAlive){
        this.isAlive=isAlive;
    }
}





