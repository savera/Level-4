
public class pythonChallenge {
	public static void main(String[] args) {

		String decoded = "";

		int add = 0;

		int value = 0;

		int value1 = 0;

		int value2 = 0;

		String decode = " g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";

		for (int i = 0; i < decode.length(); i++) {

			// gets on letter
			String letter = decode.substring(i, i + 1);

			// if letter is m
			if (letter.equals("m")) {

				// set value to 2 spaces before the added
				value = add + 2;

				// if letter is q
			} else if (letter.equals("q")) {

				// set value to 2 spaces before the added
				value1 = add + 2;

				// if letter is g
			} else if (letter.equals("g")) {

				// set value to 2 spaces before the added
				value2 = add + 2; 

				// otherwise added it to decoded
			} else {

				// add the current letter to the decoded String
				decoded = decoded + letter;

				// letters added goes up by one
				add = add + 1;

			}
			// if the letters added is equal to the value
			if (add == value) {

				// add k to decoded
				decoded = decoded + "k";

				// reset value
				value = 0;

				// if the letters added is equal to the value
			} else if (add == value1) {

				// add o to decoded
				decoded = decoded + "o";

				// reset value1
				value1 = 0;

				// if the letters added is equal to the value
			} else if (add == value2) {

				// add e to decoded
				decoded = decoded + "e"; 
				
				//reset value2
				value2 = 0; 
				

			}

		}

		// print the decoded String
		System.out.println(decoded);

	}
}
