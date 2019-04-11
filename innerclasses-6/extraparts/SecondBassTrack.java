package extraparts;

import choirparts.ChoirTrack;
import playable.PlayableTrack;

public class SecondBassTrack extends ChoirTrack implements PlayableTrack {
	public String playTrack() {
		return "Playing Second Bass Track";
	}
	PlayableTrack playBass() {
		return this.new BassTrack();
	}
	public static void main(String[] args) {
		SecondBassTrack sbt = new SecondBassTrack();
		System.out.println(sbt.playTrack());
		System.out.println(sbt.playBass().playTrack());
	}
}
