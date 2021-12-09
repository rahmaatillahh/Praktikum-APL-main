public class SpecialRoom extends RoomDecorator {

	public SpecialRoom(Room decoratedRoom)
	{
		super(decoratedRoom);
	}

	@Override public void decorate()
	{
		decoratedRoom.decorate();
		setRoom(decoratedRoom);
	}

	private void setRoom(Room decoratedRoom)
	{
	// Display message whenever function is called
		System.out.print(" special room");
	}
}