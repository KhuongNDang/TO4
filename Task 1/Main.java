public class Main{
	

	public static void main(String[] args){

		//5 team instances created
		Team myTeam1 = new Team("FCK");
		Team myTeam2 = new Team("Brondby");
		Team myTeam3 = new Team("FC Midtjylland");
		Team myTeam4 = new Team("AGF");
		Team myTeam5 = new Team("Aab");
		Team myTeam6 = new Team("Silkeborg");

		//setRank() method called to set the ranks for the different teams
		myTeam1.setRank(1);
		myTeam2.setRank(2);
		myTeam3.setRank(3);
		myTeam4.setRank(4);
		myTeam5.setRank(5);
		myTeam6.setRank(6);

		//addPlayer() method called to add s player to the different teams
		myTeam1.addPlayer("Madonna");
		myTeam2.addPlayer("Alicia Keys");
		myTeam3.addPlayer("Michael Jackson");
		myTeam4.addPlayer("Tayloer Swift");
		myTeam5.addPlayer("Kanye West");
		myTeam6.addPlayer("Aqua");

		//Prints out a toString()
		System.out.println(myTeam1.toString());
		System.out.println(myTeam2.toString());
		System.out.println(myTeam3.toString());
		System.out.println(myTeam4.toString());
		System.out.println(myTeam5.toString());
		System.out.println(myTeam6.toString());
		

}
}



