import info.gridworld.actor.*;

import info.gridworld.grid.*;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.util.Random;
import java.awt.Color;
public class Jumper extends Bug {
	private int steps;
	
	public Jumper() {
		steps = 0;
	}
	// The new and improved move method moves the bug 2 spaces instead of 1.
	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {
			return;
		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		
		Location next2 = next.getAdjacentLocation(getDirection());
		if (gr.isValid(next2)) {
			moveTo(next2);
		} else {
			removeSelfFromGrid();
		}
	}
	// The canMove2 method checks to see if the location 2 spaces in front of the bug is occupied.
	public boolean canMove2() {
		Grid<Actor> gr = getGrid(); 
		if (gr == null) {
			return false; 
		}
		
		Location loc = getLocation(); 
		Location next = loc.getAdjacentLocation(getDirection());
		Location next2 = next.getAdjacentLocation(getDirection());
		if (!gr.isValid(next)) {
			return false;
		}
		if (!gr.isValid(next2)) {
			return false;
		}
		Actor neighbor = gr.get(next2); 
		return (neighbor == null) || (neighbor instanceof Flower); 
	}
	// We rewrote the act method to move the bug according to the new parameters
	public void act() {
		if (canMove2()) {
			steps += 2;
			move();
		} else {
			turn();
			steps = 0;
		}
	}
}