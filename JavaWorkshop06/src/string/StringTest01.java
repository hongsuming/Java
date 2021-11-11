package string;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		
		String str = "I am second to none";
		char charArr[] = str.toCharArray();
		StringTokenizer st = new StringTokenizer(str," ");
		int charCount=0;
		
		
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i]==' ') {
				continue;
			}
			System.out.print(charArr[i]+" ");
			charCount++;
		}
		System.out.println("문자 개수:"+charCount);
		
		int wordCount=0;
		
		while(st.hasMoreElements()) {
			wordCount++;
			System.out.print(st.nextToken()+" ");
		}
		System.out.println("단어 개수:"+wordCount);
		

	}

}
