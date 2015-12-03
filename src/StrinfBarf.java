
public class StrinfBarf {

	public static void main(String[] args) {
		
		reverseMe("IKTFBEh_CY1=v?hctaw/moc.ebutuoy");
		
		//String word = "frab";
		
	}

	public static String reverseMe(String word) {
		
		StringBuilder builder = new StringBuilder(); 
		
		for (int i = 0; i < word.length(); i++) {
			
			String letter = word.substring(word.length() -1 -i, word.length() - i);
			
			builder.append(letter);
		}
		
		System.out.println(builder);
		
		StringBuilder reversed = builder; 
		
		String r = reversed.toString();
		
		return r; 
	}
	
}

