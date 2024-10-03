import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//    averageDigit();
//        minMax();
//        countVowels();
//        transformation();
//        separation();
    }
    static void averageDigit() {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int elements : array) {
            sum = elements + sum;
        }
        int average = sum / array.length;
        System.out.println("Среднее значение " + average);
    }
    static void minMax(){
        double[] arrey = {3.5, 5.2, -2.7, 3.8};
        double min = arrey [0];
        double max = arrey [0];
        for (double element: arrey) {
            if (element < min) {
                min=element;
            }
            if (element > max){
                max=element;
                }

        }
        System.out.println("Минимальное число " + min + "\nМаксимальное число " + max);
    }
    static void countVowels(){
    char[] chars = {'i','B','a','t','E','r'};
    char[] vowels = {'a', 'e', 'y', 'u', 'i', 'o'};
    int countVowels = 0;
    for (int i =0; i <chars.length; i++){
        chars[i] = Character.toLowerCase(chars[i]);
        for (char element: vowels){
            if (chars[i] == element){
                countVowels++;
            }
        }
    }
        System.out.println(countVowels);
    }
    static void transformation(){
        StringBuilder stringBuilder = new StringBuilder();
    String str = "Hello World and Java";
    char[] simbols = new char[str.length()];
    for (int i =0; i <simbols.length; i++){
        simbols[i] = str.charAt(i);
        if (str.charAt(i) == ' '){
            simbols[i] = '_';
        }
        stringBuilder.append(simbols[i]);
    }
        System.out.println(str = stringBuilder.toString());
    }
    static void separation(){
        String str = "apple,banana,grape,orange";
        String[] strsplit = str.split(",");
        System.out.println(Arrays.toString(strsplit));
    }
}
