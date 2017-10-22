
public class PigLatin {

	public static void main(String[] args) {
		
		System.out.print("Enter a word: ");
		String word=IO.readString();
		word.trim();
		String consonant;
		
		if(word.startsWith("a")||word.startsWith("A")||
				word.startsWith("e")||word.startsWith("E")||
				word.startsWith("i")||word.startsWith("I")||
				word.startsWith("o")||word.startsWith("O")||
				word.startsWith("u")||word.startsWith("U"))
			word+="way";
		else{
			consonant = word.substring(0,1);
			word=word.substring(1)+consonant+"ay";
		}
		
		IO.outputStringAnswer(word);
		
	}

}
