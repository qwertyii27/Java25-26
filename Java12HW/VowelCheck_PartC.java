public class VowelCheck_PartC {
    public static boolean isVowel(char a) {
        char aWorking = Character.toLowerCase(a);
        if (aWorking == 'a' || aWorking == 'e' || aWorking == 'i' || aWorking == 'o' || aWorking == 'u')
            return true;
        return false;
    }

    public static int vowelCounter(String a) {
        int vowelCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (isVowel(a.charAt(i))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        System.out.println("There are " + vowelCounter("hello") + " vowels in hello.");
        System.out.println("There are " + vowelCounter("oh hi") + " vowels in oh hi.");
        System.out.println("There are " + vowelCounter("hmmm") + " vowels in hmmm.");
    }
}
