public class Team {
	
private String team;
private int rank;
private String player;

  //Constructor with a a parameter that can be instantiated with a team name
	 public Team(String team){
        this.team = team;    
    }

    //Method that takes a number as a parameter and assigns it to the rank attribute
     public void setRank(int rank){
     	this.rank = rank;
     }

     //toString method that returns a string
  public String toString() {
        return "Hold: " + team + ", Rang: " + rank + ", Player: " + player;
    }

    //Method that takes a string as a parameter and assigns it to the player attribute
    public void addPlayer(String player){
    	this.player = player;


    }

}