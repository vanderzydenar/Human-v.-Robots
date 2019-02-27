import java.util.ArrayList;
import java.util.Scanner; 

public class Robot extends Being{

		private String id;
		private int intelRating;
		private int strengthRating;

		Robot(String id, int intelRating, int strengthRating){
			id = this.id;
			intelRating = this.intelRating;
			strengthRating = this.strengthRating;
		}

		public String getId(){
			return this.id();
		}

		public void sayHi(Being b){
			//if human
			if(b instanceof Human){
				System.out.println("HELLO HUMAN #"+((Human)b).getName+". IT IS A PLEASURE TO SERVE YOU.");
			}
			//if ROBOT
			System.out.println("010111101101001101");
		}

		public void startFight(Being b){
			if(b instanceof Human){
				if(getIntelligence() < 10){
					System.out.println("Lose");
				} 
				if(getIntelligence() > 10){
					System.out.println("Win");
					intelRating += 1;
				}
			}
			
			if(b instanceof Robot){
				if((Math.random * 100) + Math.abs(b.getIntelligence() - getIntelligence()) > 50){
					System.out.println("Win");
					intelRating += 1;
				}
					System.out.println("Lose");
			}

		}

}