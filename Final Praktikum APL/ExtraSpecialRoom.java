public class ExtraSpecialRoom extends RoomDecorator {

	 /**
     * construct method ActionRomance
     * 
     * @param decoratedRoom
     */
	
	public ExtraSpecialRoom(Room decoratedRoom)
	{
		super(decoratedRoom);
	}


	/**
     * override method di room decorator untuk mendekorasi ruangan agar lebih bagus
     *
     * @Override 
     */
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