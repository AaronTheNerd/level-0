import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		String holder;
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell Batman");
		// 2. Catch the user's answer in a String
		holder = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct")
		if (holder.equalsIgnoreCase("Batman")) {
			speak("correct");
		}
		// 4. Otherwise say "wrong"
		else {
			speak("wrong");
		}
		// 5. repeat the process for other words
		String holder2;
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell hello");
		// 2. Catch the user's answer in a String
		holder2 = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct")
		if (holder.equalsIgnoreCase("hello")) {
			speak("correct");
		}
		// 4. Otherwise say "wrong"
		else {
			speak("wrong");
		}
		String holder3;
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell Goodbye");
		// 2. Catch the user's answer in a String
		holder3 = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct")
		if (holder.equalsIgnoreCase("Goodbye")) {
			speak("correct");
		}
		// 4. Otherwise say "wrong"
		else {
			speak("wrong");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}