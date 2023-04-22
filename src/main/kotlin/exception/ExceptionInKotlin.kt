package exception

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    fun parseIntOrThrow(string: String) : Int {
        try {
            return string.toInt();
        } catch (exception : NumberFormatException) {
            throw java.lang.IllegalArgumentException("숫자 아님~")
        }
    }

    // try catch에서 return 작성할 필요 없음
    fun parseIntOrThrow2(string: String) : Int? {
        return try {
            string.toInt();
        } catch (exception : NumberFormatException) {
            null;
        }
    }

    // kotlin은 chekedException이 없다.
    fun readFile() {
        val currentFile = File(".");
        val file = File(currentFile.absolutePath + "/a.txt");
        val reader = BufferedReader(FileReader(file));
        println(reader.readLine());
        reader.close();
    }

    // kotlin은 try-with-resources 구문이 없다.
    fun readFile2(path : String) {
        BufferedReader(FileReader(path)).use {
            reader -> println(reader.readLine())
        }
    }
}