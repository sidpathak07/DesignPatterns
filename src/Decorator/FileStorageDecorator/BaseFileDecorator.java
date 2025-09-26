package Decorator.FileStorageDecorator;

public abstract class BaseFileDecorator implements FileStorage{
    FileStorage fileStorage;

    public BaseFileDecorator(FileStorage fileStorage) {
        this.fileStorage=fileStorage;
    }
}
