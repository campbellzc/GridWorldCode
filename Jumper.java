public class Jumper extends Bug {
	

	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {
			return;
		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next)) {
			moveTo(next);
		}
		Location next2 = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next2)) {
			moveTo(next2);
		} else {
			removeSelfFromGrid();
		}

	}
}