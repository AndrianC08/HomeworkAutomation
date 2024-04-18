
public class Ex5 {
        public static void main(String[] args) {
                String phrase = "I love Java";

                System.out.println("Letter at index 4: " + phrase.charAt(4));

                System.out.println("Index of letter 'J': " + phrase.indexOf('J'));

                phrase += " and QA Automation";
                System.out.println("Updated phrase: "+phrase);

                System.out.println("Is I Love Java  a String? " +true);
        }
}
