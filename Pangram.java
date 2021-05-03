package OtherProjs;
import java.util.*;


class Pangram {
	public static void main(String[] args) {
		String sentence = new String();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence to check");
		sentence = scan.nextLine();
		if(checkIfPangram(sentence) == true) {
			System.out.println("sentence is pangram");
		}else {
			System.out.println("sentence is not pangram");
		}
		
		
		
	}
    static boolean checkIfPangram(String sentence) {
        Set<Character> st = new HashSet<>();
        if(sentence.length() < 26){
            return false;
        }else{
            for(int i=0;i < sentence.length();i++){
                if(Character.isWhitespace(sentence.charAt(i)) == false) {
                	st.add(sentence.charAt(i));
                }
            	
            }
            if(st.size() ==  26){
                return true;
            }else{
                return false;
            }
          }
    
    }
}
