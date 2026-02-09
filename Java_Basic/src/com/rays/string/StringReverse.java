package com.rays.string;

public class StringReverse {

	public static void main(String[] args) {

		String str = "google";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}



	

        // String name = "vijay dinanath chouhan";
        // String[] words = name.split(" ");   // ["vijay", "dinanath", "chouhan"]

        // for (String word : words) {
        //     String reversedWord = "";

        //     for (int i = 0; i < word.length(); i++) {
        //         reversedWord = word.charAt(i) + reversedWord;
        //     }

        //     System.out.print(reversedWord + " ");
        // }
    
}

}
