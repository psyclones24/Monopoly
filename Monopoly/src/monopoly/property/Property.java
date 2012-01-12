package monopoly.property;

import java.awt.*;

abstract class Property {
	protected int rent[] = new int[6];
	protected int buildings = 0;
	protected boolean canBuild = true;
	protected int set;
	protected int cost;
	protected Dimension[] person = new Dimension[4];
	protected Dimension[] building = new Dimension[4];

	public boolean canBuild() {
		return canBuild;
	}

	public int getCost() {
		return cost;
	}

	public int getRent() {
		return rent[getBuildings()];
	}

	public int getSet() {
		return set;
	}

	public int getBuildings() {
		return buildings;
	}

	public Dimension getPlayerPlacement(int numberOnSpace) {
		if (numberOnSpace == 0) {
			return person[0];
		} else if (numberOnSpace == 1) {
			return person[1];
		} else if (numberOnSpace == 2) {
			return person[2];
		} else {
			return person[3];
		}
	}

	public Dimension getBuildingPlacement(int buildings) {
		if (buildings == 0) {
			return building[0];
		} else if (buildings == 1) {
			return building[1];
		} else if (buildings == 2) {
			return building[2];
		} else if (buildings == 3) {
			return building[3];
		} else {
			return building[4];
		}
	}

}