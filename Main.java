import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
//        file.createNewFile();

        List<String> data = new ArrayList<>();
        data.add("Java");
        data.add("Python");
        data.add("C++");

//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
//            for(String s: data){
//                writer.write(s);
//                writer.newLine();
//            }
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
//            String s;
//            while((s= reader.readLine()) != null){
//                System.out.println(s);
//            }
//        }

//        try (FileReader reader = new FileReader(file)){
//            int s;
//            while((s= reader.read()) != -1){
//                System.out.println((char)s);
//            }
//        }

//        try (FileWriter writer = new FileWriter(file)){
//            String a = "Java";
//            for (int i = 0; i < a.length(); i++) {
//                writer.write(a.charAt(i));
//            }
//            writer.write("\n");
//        }

//        try(FileInputStream inputStream = new FileInputStream(file)){
//            int i = inputStream.read();
//            while(i!= -1){
//                System.out.println((char)i);
//                i=inputStream.read();
//            }
//        }

//        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
//            String java = "Java";
//            for (int i = 0; i < java.length(); i++) {
//                fileOutputStream.write(java.charAt(i));
//            }
//        }

//        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))){
//            String java = "Java";
//            bufferedOutputStream.write(java.getBytes(), 0, java.getBytes().length);
//        }

//        try(BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(file))){
//            byte[] array = new byte[1024];
//            int length;
//            while((length = fileInputStream.read(array))>0){
//                for (byte v: array){
//                    System.out.println((char)v);
//                }
//            }
//        }

//        try(ObjectInputStream objectStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
//            System.out.println(objectStream.readObject());
//        } catch (ClassNotFoundException e){
//            throw new RuntimeException(e);
//        }

        FileService fileService = new FileService("file.txt");
        fileService.write("Hello");


    }
}