public class KernelBasedApplication {
	private int numKernel;
	// map from the KernelId to the inner index id
	private Map<Integer, Integer>kernelId2Index;
	// map from the inner index id to KernelId
	private Map<Integer, Integer>index2KernelId;
	private boolean[] submitted;
	// finished used to check if the task has ended
	private boolean[] finished;
	// store the final status of the execution of all kernels in the KernelBasedApplication
	// -1: not tracked 0: finished 1: not finished 2: failed
	private int kbAPPFinalStatus;
	/*
	 * dependency[1][0] = 1 means kernel 1 can only be executed after on kernel 0 is ended
	 * 	 0 1
	 * 0 
	 * 1
	 */
	private int[][] dependency;
	/*
	 * Stores the run-time kernel-dependency graph information
	 * initial: if dependency[0][1] = 1, dependency_met[0][1] = 0
	 * 			otherwise, dependency_met[0][1] = 1
	 * dependency_met[0][1] = 1 means dependency for 0 is met considering 1
	 */
	private int[][] dependency_met;
	......
}