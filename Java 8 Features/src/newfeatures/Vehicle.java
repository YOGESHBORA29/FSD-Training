package newfeatures;

public interface Vehicle {
	//default all are abstract
	String getBrand();
	String speedUp();
	String slowDown();
	// any non abstract meathod must be made deafault to add new feacture
	default String turnAlarmOn()
	{
	return "Turning the Vehicle Alarm ON.";
	}
	
	default String turnAlarmoff()
	{
	return "Turning the Vehicle Alarm OFF.";
	}
	static int getHorsePower(int rpm,int torque)
	{
	return (rpm*torque)/5252;
	}


}
