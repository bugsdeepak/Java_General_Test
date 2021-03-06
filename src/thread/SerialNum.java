package thread;

public class SerialNum {
	// The next serial number to be assigned
	private static int nextSerialNum = 0;

	private static ThreadLocal serialNumber = new ThreadLocal() {
		protected synchronized Object initialValue() {
			return new Integer(nextSerialNum++);
		}
	};

	public static int get() {
		return ((Integer) (serialNumber.get())).intValue();
	}
}
