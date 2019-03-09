while(virtualTime < simulationTime) {
	......
	// check whether is kernel-based application that have multiple kernels
	if (SimSettings.getInstance().isKernelBasedApplication(randomApplicationType)) {
		// create instance of kernel-based application
		// add the instance to KernelBasedapplication
		KernelBasedApplicationStatus.getInstance().addKernelBasedApplication(kernelNum, kernelBasedAppId);
		// add all the kernelProperty in this application to kernelPropertyList	
	}
	else {
		atomicAppNum++;
		kernelPropertyList.add(new KernelProperty(i,randomApplicationType, virtualTime, expRngList, kernelId));
		kernelId++;
	}
}