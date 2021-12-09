public class SpecialRoom extends RoomDecorator { //extends class Roomdecorator

	public SpecialRoom(Room decoratedRoom)
	{
		super(decoratedRoom); //method super akan mengidentifikasi object dari class Ring
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