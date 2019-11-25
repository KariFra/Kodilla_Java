package com.kodilla.exception.io;

import jdk.internal.org.objectweb.asm.ClassReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile(){
        ClassLoader classReader = getClass().getClassLoader();
        File file = new File(ClassLoader.getSystemResource("file/names.txt").getFile());
        Path path = Paths.get(file.getPath());
        System.out.println(file.getPath());

        try {
            Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);
        } catch(IOException e ){
        System.out.println("Ups something went wrong!"+ e);
        }

    }

}
