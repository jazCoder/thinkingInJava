package choirparts;

import playable.PlayableTrack;

public class ChoirTrack {
	
	public class BassTrack implements PlayableTrack {
		public BassTrack() {};
		public String playTrack() {
			return "Playing Bass Track";	
		};
		public BassTrack bass() {
			return new BassTrack();
		}
	}
}
