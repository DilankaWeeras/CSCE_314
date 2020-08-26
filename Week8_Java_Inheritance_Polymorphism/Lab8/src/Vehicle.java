public abstract class Vehicle 
{
	private float speed;
	protected String motor;

	Vehicle()
	{
		speed = 0;
	}
	Vehicle(float s)
	{
		speed = s;
	}

	public float getSpeed() { return speed; }
	public void setSpeed(float speed) { this.speed = speed; }

	public void left() { System.out.println("left"); } ;
	public void right() { System.out.println("right"); } ;
	public void forward() { System.out.println("forward"); } ;
	public void reverse() { System.out.println("backward"); } ;

	protected abstract String getMotor();
	protected abstract void setMotor(String motor);	
}