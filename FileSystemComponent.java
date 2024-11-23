package Модуль10dz;

import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
    void display();
    int getSize();
}

class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Файл: " + name + ", размер: " + size + " байт");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Файл: " + name;
    }
}

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        if (!components.contains(component)) {
            components.add(component);
            System.out.println("Добавлен: " + component.toString());
        } else {
            System.out.println("Компонент уже существует: " + component.toString());
        }
    }

    public void removeComponent(FileSystemComponent component) {
        if (components.remove(component)) {
            System.out.println("Удален: " + component.toString());
        } else {
            System.out.println("Компонент не найден: " + component.toString());
        }
    }

    @Override
    public void display() {
        System.out.println("Папка: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public String toString() {
        return "Папка: " + name;
    }
}


