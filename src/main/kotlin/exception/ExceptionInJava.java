package exception;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionInJava {
    public static void main(String[] args) {

    }

    private int parseIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("숫자 아님 ㅜ");
        }
    }

    private Integer parseIntOrThrow2(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException exception) {
            return null;
        }
    }

    private void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsolutePath() + "/a.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();
    }

    private void readFile2(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        }
    }
}
