public class KernelBasedApplicationStatus {
	private static KernelBasedApplicationStatus instance = null;
	// used when we want to add an event to SimManager
	private int simManagerId;
	private int numKernelBasedApplication;
	private Map<Integer, KernelBasedApplication> kernelBasedApplicationMap;
	// map kernelBasedApplication id to the key in kernelBasedApplicationMap
	private Map<Integer, Integer> mKeyMap;
	
	public static KernelBasedApplicationStatus getInstance() {
		if (instance == null) {
			instance = new KernelBasedApplicationStatus();
		}
		return instance;
	}
	...
}