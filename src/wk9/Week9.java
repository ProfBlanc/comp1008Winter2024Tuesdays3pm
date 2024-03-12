package wk9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Week9 {

    static void example1(){

        //list all the files and directorys of cwd (current working directory)
        Path path = Path.of( "src", "wk9");
        System.out.println(path.toFile().exists());
        System.out.println(path.toAbsolutePath().toString());

      //  String[] allFilesAndFolders = path.toFile().list();
        File[] allFilesAndFolders = path.toFile().listFiles();

//        for(String fileOrFolder : allFilesAndFolders){
        for(File fileOrFolder : allFilesAndFolders){
            System.out.println(fileOrFolder.getName());
            System.out.println(fileOrFolder.length()); // size in bytes
            System.out.println(fileOrFolder.isFile());
            System.out.println(fileOrFolder.isDirectory());
            System.out.println("*".repeat(20));
        }

    }
    static void example2() throws Exception{

        Path path = Path.of("src/wk9/test8");
//        Files.createDirectory(path);
        Files.createDirectories(path);

    }
    static void example3() throws Exception{
        Path path1 = Path.of("src/wk9/test1");
        Path path2 = Path.of("src/wk9/test9");
//        Files.copy(path1, path2);
        Files.move(path1, path2);
    }
    static void example4() throws Exception{
        Path path = Path.of("src/wk9/test9");
        path.toFile().delete();

    }
    static void example5() throws Exception{
        //Path path = Path.of("src/wk9/test2/file1.txt");
        Path path = Path.of("src/wk9/test3");
        path = path.resolve("test4").resolve("test5")
                .resolve("file3.txt");

        path.toFile().createNewFile();


    }
    static void example6() throws Exception{
        Path path = Path.of("src/wk9/test2/file3.txt");
        //String content = Files.readString(path);
        List<String> allLines = Files.readAllLines(path);

    }
    static void example7() throws Exception{
        //write data to a file
        Path path = Path.of("src/wk9/test2");
        path = path.resolve("file4.txt");
        String content = "Hello everyone!\n";
        //
        if(!Files.exists(path))
            Files.createFile(path);
        Files.writeString(path, content, StandardOpenOption.APPEND);

    }
    static void example8(){}
    static void example9(){}
    static void example10(){}
    public static void main(String[] args) {
        try {
            example7();
        }
        catch (Exception e){
            System.err.println(e);
        }
        }
}
