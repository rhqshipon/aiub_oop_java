import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		FrameIntro fi = new FrameIntro();
		fi.setVisible(true);
		// Center the frame on the screen
        fi.setLocationRelativeTo(null); // <-- This does the centering
	}
}