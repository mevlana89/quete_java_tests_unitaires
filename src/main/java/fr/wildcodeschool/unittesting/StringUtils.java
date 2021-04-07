package fr.wildcodeschool.unittesting;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        if (candidate == null)
                return "";
        char[] letters = candidate.toCharArray();
        for (int i = 1; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    public String uniqueVowels(String candidate) {
        String data="";
        candidate = vowels(candidate);
        for(int i=0; i<candidate.length(); i++)
        {
            data+=(data.contains(candidate.charAt(i)+"")?"":candidate.charAt(i)+"");
        }
        return data;
    }
}