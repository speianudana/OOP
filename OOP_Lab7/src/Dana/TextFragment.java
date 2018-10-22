package Dana;

public class TextFragment {
    String textfragment;

    public TextFragment() {
    }
 public TextFragment(String textfragment){
        this.textfragment=textfragment;
 }

     int countS(String str1){
        int  sentenceCount=1;
//		String myFile = "The quick brown fox jumps over the lazy dog. Wow!!!!";
        String SENTENCE_DELIMETERS = ".?!";
        for(int i=0;i<str1.length()-1;i++){
            for(int j=0;j<SENTENCE_DELIMETERS.length();j++){
                if(str1.charAt(i)==SENTENCE_DELIMETERS.charAt(j)){
                    if(str1.charAt(i+1)==SENTENCE_DELIMETERS.charAt(j)){
                        sentenceCount--;}
                    sentenceCount++;  } } }
    return sentenceCount;}
public int countWords(String s){
    int count = 1;

		for (int i = 0; i < s.length() - 1; i++)
    {
        if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
        {
            count++;

        }
    }
    return count+1;}

    int consonantsNumber(String sentence) {

        int consonantCount = 0;
        int i;
        String consonants = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
        for (i = 0; i < sentence.length(); i += 1) {
            char currentChar = sentence.charAt(i);
            int index;
            for (index = 0; index < consonants.length(); index += 1) {
                if (consonants.charAt(index) == (currentChar)) {
                    consonantCount++;
                }
            }
        }
        return consonantCount;
    }




    int vowelNumber(String sentence) {

        int vowelCount = 0;
        int i;
        String vowels = "aeiouAEIOU";
        for (i = 0; i < sentence.length(); i += 1) {
            char currentChar = sentence.charAt(i);
            int index;
            for (index = 0; index < vowels.length(); index += 1) {
                if (vowels.charAt(index) == (currentChar)) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
void wordFrequency(String text){
  //  String text = "the quick brown fox jumps fox fox over the lazy dog brown";
    String[] keys = text.split(" ");
    String[] uniqueKeys;
    int count = 0;
        System.out.println(text);
    uniqueKeys = getUniqueKeys(keys);
        for(String key: uniqueKeys)
    {
        if(null == key)
        {
            break;
        }
        for(String s : keys)
        {
            if(key.equals(s))
            {
                count++;
            }
        }
        System.out.println("Count of ["+key+"] is : "+count);
        count=0;
    }
    
}
    public  String[] getUniqueKeys(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];
        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;
        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }
            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;
            }
            keyAlreadyExists = false;
        }
        return uniqueKeys;
    }
}



