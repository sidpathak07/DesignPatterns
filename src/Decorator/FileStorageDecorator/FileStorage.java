package Decorator.FileStorageDecorator;

public interface FileStorage {
    void storeFile(String fileName,byte[] content);
    byte[] getFile(String fileName);
}
