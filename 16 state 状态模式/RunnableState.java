package state;

public class RunnableState extends ThreadState {
	public RunnableState() {
		state = StateSet.RANNABLE;
		System.out.println("就绪状态");
	}

	public void getCpu(ThreadContext tc) {
		System.out.println("获得CPU时间");
		if (state == StateSet.RANNABLE)
			tc.setThreadState(new RunningState());
		else
			System.out.println("当前转改不是就绪状态");
	}

}
