package Monopoly.Property;
import java.awt.*;

public class MediterraneanAvenue extends Property{

	public MediterraneanAvenue(){
		rent[0] = 2;
		set = 1;
		cost = 60;
		for(int i = 0; i < 4; i++){
			person[i] = new Dimension(2 * i, 2 * i);
			building[i] = new Dimension((2 * i) + 1, (2 * i) + 1);
		}
	}


}