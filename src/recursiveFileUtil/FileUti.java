package recursiveFileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUti {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //        fileSearch();
//        contentSearch();
        findLines();
//        printSizeOfPackage();
//        createFileWithContent();


    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("input path");
        String path = scanner.nextLine();
        System.out.println("input fileName");
        String fileName = scanner.nextLine();
        File file = new File(path + "\\" + fileName);
        System.out.println(file.exists());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("input path");
        String path = scanner.nextLine();
        System.out.println("input key");
        String keyWord = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        String lines = "";
        for (File fileC : files) {
            try (BufferedReader bufferedReader = new BufferedReader(new BufferedReader(new FileReader(fileC)))) {
                while ((lines = bufferedReader.readLine()) != null) {
                    if (lines.contains(keyWord)) {
                        System.out.println(fileC.getName());
                    }
                }
            } catch (IOException e) {
                System.out.println("exception");

            }

        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("input txtPath");
        String txtPath = scanner.nextLine();
        System.out.println("input keyword");
        String keyword = scanner.nextLine();
        File file = new File(txtPath);
        File[] file1 = file.listFiles();
        recursiveFindLines(file1, keyword);
    }

    static void recursiveFindLines(File[] file, String keyword) {
        for (File files : file) {
            if (files.isDirectory()) {
                System.out.println("-> folder -> " + files.getName());
                recursiveFindLines(files.listFiles(), keyword);
                System.out.println("<-package " + files.getName() + " <- output");
            } else {
                String lines = "";
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(files.getPath()))) {
                    while ((lines = bufferedReader.readLine()) != null) {
                        if (lines.contains(keyword)) {
                            System.out.println("      file -> " + files.getName() + " we have " + lines);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("exception");
                }
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("input path");
        String path = scanner.nextLine();
        File file = new File(path);
        File array[] = file.listFiles();
        int bytes = 0;
        for (File files : array) {
            bytes += files.length();
        }
        System.out.println(bytes + " bytes");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("input path");
        String path = scanner.nextLine();
        System.out.println("input name new creath file");
        String file = scanner.nextLine();
        System.out.println("input content file");
        String content = scanner.nextLine();
        String pathConcatFile = path + "\\" + file;
        File fileContent = new File(pathConcatFile);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathConcatFile));) {
            if (!fileContent.exists()) {
                fileContent.createNewFile();
                bufferedWriter.write(content);
                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.out.println("exception");
        }
    }
}
