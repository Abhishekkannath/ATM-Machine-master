import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("Hey there! Welcome to the ATM! "); 
		System.out.println("Get ready to manage your finances with ease and convenience. We're excited to have you on board!");
	}
}
