//Creation of applications are scheduled here!
for(int i=0; i< loadGeneratorModel.getKernelPropertyList().size(); i++) {
	int taskPropertyId = loadGeneratorModel.getKernelPropertyList().get(i).getKernelId();
	if (KernelBasedApplicationStatus.getInstance().checkKernelInKBApp(taskPropertyId)) {
		boolean ready_to_submit = KernelBasedApplicationStatus.getInstance().checkReadySubmit(taskPropertyId);
		if (ready_to_submit) {
			schedule(getId(), loadGeneratorModel.getKernelPropertyList().get(i).getStartTime(), CREATE_KERNEL_IN_ATOMIC, loadGeneratorModel.getKernelPropertyList().get(i));
			//TaskBasedTaskStatus.getInstance().setTaskSubmit(taskPropertyId);
			// cannot set the sub-task as submitted here, otherwise, all the task will be submitted
			KernelBasedApplicationStatus.getInstance().setKernelSubmit(taskPropertyId);
		}
	}
	else {
		schedule(getId(), loadGeneratorModel.getKernelPropertyList().get(i).getStartTime(), CREATE_KERNEL_IN_ATOMIC, loadGeneratorModel.getKernelPropertyList().get(i));
	}
}