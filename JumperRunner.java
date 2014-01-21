import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import java.util.Random;
import java.awt.Color;

public class JumperRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper bob = new Jumper();
		world.add(new Location(5, 5), bob);
		world.show();
	}
}