a. Jumper should extend bug.
b. BoxBug is a similar class.
c. Yes and it should take in the length
d. The method "move" should be overridden, as well as the method "act".
e. A canMove2 method should be added.
f. To remake the move method so that it moves 2 spaces instead of 1, and doesn't leave a flower in it's place. It will override the act method to make the bug jump over obstacles. We will make a "canMove2" method as well in order to test whether the spot 2 spaces in front of the bug is there. We will test:
	1. If there is a rock 1 space in front of the bug, it should still go forward 2, as long as it is still inside the grid.
	2. If there is a rock 2 spaces in front of the bug, it should turn until it has space to move 2 spaces. If there is a flower, it should continue to move into that space and erase the flower.
	3. If the grid is bounded, it should turn as it hits walls.
	4. If 2 bugs jump to the same spot, we will test and see what happens.