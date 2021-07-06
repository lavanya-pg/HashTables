package com.bridgelabz;

public class HashTable 
{
	public static void main(String[] args) 
	{
        HashTableImpl<String, Integer> hash = new HashTableImpl();
        String message = "“Paranoids are not\r\n"
        		+ "paranoid because they are paranoid but\r\n"
        		+ "because they keep putting themselves\r\n"
        		+ "deliberately into paranoid avoidable\r\n"
        		+ "situations”";

        //String to String[] conversion.
        String[] messageArray = message.toLowerCase().split(" ");

        //Iterate within the array
        for(String word: messageArray) {
            //Search for the word in the linked list
            Integer value =  hash.get(word);
            if( value == null)
                value = 1;
            else
                value = value + 1;
            hash.add(word , value);
        }
        //Display the linked list
        System.out.println(hash);
    }

}
