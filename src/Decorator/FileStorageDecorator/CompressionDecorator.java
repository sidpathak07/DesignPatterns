package Decorator.FileStorageDecorator;

import Decorator.FileStorageDecorator.utils.StorageUtils;

public class CompressionDecorator extends BaseFileDecorator{
    private final FileStorage nextLayer;

    public CompressionDecorator(FileStorage fileStorage){
        super(fileStorage);
        this.nextLayer=fileStorage;
    };
    public void compressFile(String fileName){
        byte[] file = fileStorage.getFile(fileName);
        file = StorageUtils.compress(file);
        this.storeFile(fileName, file);
    }

    public void decompressFile(String fileName){
        byte[] file = fileStorage.getFile(fileName);
        file = StorageUtils.decompress(file);
        this.storeFile(fileName, file);
    }
    public void storeFile(String fileName,byte[] content){
        byte[] file = StorageUtils.compress(content);
        nextLayer.storeFile(fileName, file);
    }
    public byte[] getFile(String fileName){
        byte[] file = nextLayer.getFile(fileName);
        return StorageUtils.decompress(file);
    }
}
