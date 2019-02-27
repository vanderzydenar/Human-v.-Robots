import java.util.ArrayList;
import java.util.Scanner; 

public class Being{
	
		private int intelRating;
		private int strengthRating;

		Being(int intelRating, int strengthRating){
			this.intelRating = intelRating;
			this.strengthRating = strengthRating;
		}

		public int getStrength(){
			return this.strengthRating;
		}

		public int getIntelligence(){
			return this.intelRating;
		}

		public void sayHi(Being b){
		}

		public void startFight(Being b){
		}



}