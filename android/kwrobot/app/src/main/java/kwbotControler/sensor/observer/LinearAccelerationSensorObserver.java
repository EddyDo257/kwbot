package kwbotControler.sensor.observer;

/**
 * An angular velocity sensor observer interface. Classes that need to observe the
 * angular velocity sensor for updates should do so with this interface.
 * 
 * @author Kaleb
 * @version %I%, %G%
 */
public interface LinearAccelerationSensorObserver
{
	/**
	 * Notify observers when new angular velocity measurements are available.
	 //* @param angularVelocity the angular velocity of the device (x,y,z).
	 * @param timeStamp the time stamp of the measurement.
	 */
	public void onLinearAccelerationSensorChanged(float[] linearAcceleration, long timeStamp);
}
