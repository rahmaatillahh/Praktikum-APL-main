public class ExtraSpecialRoom extends RoomDecorator {

	public ExtraSpecialRoom(Room decoratedRoom)
	{
		super(decoratedRoom);
	}

	@Override 
	public void decorate()
	{
		decoratedRoom.decorate();
		setRoom(decoratedRoom);
	}

	private void setRoom(Room decoratedRoom)
	{
	// Display message whenever function is called
		System.out.print(" extra special room");
	}
}