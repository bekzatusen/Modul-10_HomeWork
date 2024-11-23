package Модуль10dz;

public class FileSystemTest {

    public static void main(String[] args) {
        Directory rootDirectory = new Directory("Корневая папка");
        Directory subDirectory1 = new Directory("Подпапка 1");
        Directory subDirectory2 = new Directory("Подпапка 2");

        File file1 = new File("файл1.txt", 150);
        File file2 = new File("файл2.txt", 300);
        File file3 = new File("файл3.txt", 450);

        subDirectory1.addComponent(file1);
        subDirectory2.addComponent(file2);
        subDirectory2.addComponent(file3);

        rootDirectory.addComponent(subDirectory1);
        rootDirectory.addComponent(subDirectory2);

        rootDirectory.display();
        System.out.println("Общий размер корневой папки: " + rootDirectory.getSize() + " байт");
    }
}
