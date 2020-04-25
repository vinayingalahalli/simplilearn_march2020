package inherit_demo_2;

public class Player extends Person {

		private String teamName;
		private int score;
		
		public Player() {
			// TODO Auto-generated constructor stub
		}

		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public Player(int id, String name,String teamName, int score) {
			super(id,name);
			this.teamName = teamName;
			this.score = score;
		}
		
		public void printPlayer() {
			System.out.println("Printing Player details");
			super.printPerson();
			System.out.println("Team Name : "+teamName);
			System.out.println("Score : "+score);
		}
		
}
