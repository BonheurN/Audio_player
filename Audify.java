import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Audify {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File file = new File("Dancin' – MBB (No Copyright Music).wav");
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		
		
		String Response = "";
		
		while(!Response.equals("Q")) {
			System.out.println("P = play, S = stop, Q = Quit, R = reset, ");
			System.out.print("Enter your choice: ");
			
			Response = scanner.next();
			Response.toUpperCase();
			
			switch(Response) {
			case("P"): clip.start();
			break;
			case("S"): clip.stop();
			break;
			case("R"): clip.setMicrosecondPosition(0);
			break;
			case("Q"): clip.close();
			break;
			default: System.out.println("This is an invalid response");
			}
			
		}
		System.out.println("Byee");
		
	}
}
