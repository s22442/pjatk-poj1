import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class App129 {
    public static ArrayList<Float> sortArrayList(ArrayList<Float> al) {
        ArrayList<Float> newAl = new ArrayList<Float>(al);

        int alSize = newAl.size();
        for (int i = 0; i < alSize - 1; i++) {
            for (int j = 0; j < alSize - i - 1; j++) {
                if (newAl.get(j) > newAl.get(j + 1)) {
                    Collections.swap(newAl, j, j + 1);
                }
            }
        }

        return newAl;
    }

    public static ArrayList<Float> sortArrayList(ArrayList<Float> al, boolean descending) {
        if (!descending) {
            return sortArrayList(al);
        }

        ArrayList<Float> newAl = new ArrayList<Float>(al);

        int alSize = newAl.size();
        for (int i = 0; i < alSize - 1; i++) {
            for (int j = 0; j < alSize - i - 1; j++) {
                if (newAl.get(j) < newAl.get(j + 1)) {
                    Collections.swap(newAl, j, j + 1);
                }
            }
        }

        return newAl;
    }

    public static String floatToFixedToString(float f) {
        return String.format("%.6f", f);
    }

    public static String arrayListToString(ArrayList<Float> al) {
        ArrayList<Float> tmpAl = new ArrayList<Float>(al);

        String str = floatToFixedToString(tmpAl.get(0));
        tmpAl.remove(0);

        for (float f : tmpAl) {
            str += " " + floatToFixedToString(f);
        }

        return str;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrings = br.readLine().split(" ");

        ArrayList<Float> numbers = new ArrayList<Float>();
        for (String str : inputStrings) {
            numbers.add(Float.parseFloat(str));
        }

        ArrayList<Float> numbersAscending = sortArrayList(numbers);
        ArrayList<Float> numbersDescending = sortArrayList(numbers, true);

        System.out.println(arrayListToString(numbersAscending));
        System.out.println(arrayListToString(numbersDescending));
    }
}