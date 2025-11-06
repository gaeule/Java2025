package remotecontrol;

public class Radio implements RemoteControl{
	int volume;
	public void TurnOn() {
		System.out.println("Turn on Raido!!");
	}
	
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("RAdio volume : " + volume);
		
	}
}
