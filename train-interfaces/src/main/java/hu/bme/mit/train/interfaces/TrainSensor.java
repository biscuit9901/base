package hu.bme.mit.train.interfaces;

public interface TrainSensor {

	int getSpeedLimit();

	void overrideSpeedLimit(int speedLimit);

	void  tachograf(int t, int ref, int con);

	public int tableSize();

}
