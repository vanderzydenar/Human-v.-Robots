import java.util.ArrayList;
import java.util.Scanner; 

public class Human extends Being{

		private String name;
		private int intelRating;
		private int strengthRating;

		Human(String name, int intelRating, int strengthRating){
			name = this.name;
			intelRating = this.intelRating;
			strengthRating = this.strengthRating;
		}

		public void startFight(Being b){
			if(b instanceof Human){
				if(b.getStrength > this.strengthRating && this.getIntelligence > b.getIntelligence()*2){
					System.out.println("Win");
				}
				if(b.getStrength < this.strengthRating){
					System.out.println("Win");
				}
				System.out.println("Lose");
			}
			
			if(b instanceof Robot){
				System.out.println("Win");
				this.strengthRating += -1;
			}

		}

		public void sayHi(Being b){

			//if human
			if(b instanceof Human){
				talkChance = (Math.random() * 100) + 0 + (10*intelRating);

				if(talkChance > 50){
					System.out.println(this.name + ": Hi " + ((Robot)b).getID());
				}
			}
			//if ROBOT
			System.out.println("Hello robot number #"+((Robot)b).getName()+".Make me a sandwich");

		}

		public String getName(){
			return this.name();
		}

}