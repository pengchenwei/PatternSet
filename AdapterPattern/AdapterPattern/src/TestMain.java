import org.junit.Test;

import com.pen.adapterPattern.Impl.PlayerImpl;

/**
 * @author pen
 *
 */
public class TestMain {

	@Test
	public void test() {
		PlayerImpl audioPlayer = new PlayerImpl();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
