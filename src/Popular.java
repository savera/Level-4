import java.util.Scanner;

import javax.swing.JOptionPane;

public class Popular {

	static Popular pop = new Popular();

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String everyDayThings = JOptionPane.showInputDialog("Type in everyday things.");

		try {
			pop.hipThings(everyDayThings);

		} catch (OutOfStyleEception e) {

			e.printStackTrace();
			
		} catch (NotCoolException e) {
			
			e.printStackTrace();
		}

	}

	public void hipThings(String cool) throws NotCoolException {

		if (cool.equals("homework")) {

			throw new NotCoolException("So Not Cool");

		} else if (cool.equals("watching TV")) {

			throw new OutOfStyleEception("So Not Cool");

		}

	}

}
