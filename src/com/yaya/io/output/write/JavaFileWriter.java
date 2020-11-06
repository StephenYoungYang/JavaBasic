package com.yaya.io.output.write;

import com.yaya.io.ConstantFilePath;

import java.io.FileWriter;

public class JavaFileWriter {

    public void fileWriterMethod() {
        try (FileWriter fileWriter = new FileWriter(ConstantFilePath.OUTPUT_PATH)) {
            fileWriter.write("young");
            fileWriter.append("yang");
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
