public abstract class RoomDecorator implements Room {

	// Protected variable
	protected Room decoratedRoom;

	// Method 1
	// Abstract class method
	public RoomDecorator(Room decoratedRoom)
	{
		// This keywordd refers to current object itself
		this.decoratedRoom = decoratedRoom;
	}

	// Method 2 - draw()
	// Outside abstract class
	public void decorate() { 
        decoratedRoom.decorate(); 
    }
}