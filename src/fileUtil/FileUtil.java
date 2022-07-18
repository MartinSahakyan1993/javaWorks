package fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println(("input path"));
        String path = scanner.nextLine();
        System.out.println("input fileName");
        String fileName = scanner.nextLine();
        File file = new File(path + "\\" + fileName);
        System.out.println(file.exists());
        System.out.println(file.getName());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("input phat foldr");
        String path = scanner.nextLine();
        System.out.println("input keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        for (File file1 : files) {
            if (file1.getName().contains(keyword)) {
                System.out.println(file1.getName());
            }


        }

    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("input txtPath");
        String txtPath = scanner.nextLine();
        System.out.println("input keyword");
        String keyword = scanner.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath));
        String line = "";
        for (int i = 1; (line = bufferedReader.readLine()) != null; i++) {
            if (line.equals(keyword)) {
                System.out.println(i + ": " + line);
            }
        }


    }


    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("input phat ");
        String path = scanner.nextLine();
        File file = new File(path);
        int size = 0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            size += file1.length();

        }
        System.out.println(size + " byte");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("input path");
        String path = scanner.nextLine();
        System.out.println("input fileName");
        String fileName = scanner.nextLine();
        System.out.println("input content");
        String content = scanner.nextLine();
        String pathConcatFile = path + "\\" + fileName;
        File file = new File(pathConcatFile);
        if (!file.exists()) {
            file.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathConcatFile));
            bufferedWriter.write(content);
            bufferedWriter.close();
        }
    }
}
