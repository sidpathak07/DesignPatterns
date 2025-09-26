package Decorator.FileStorageDecorator;

import Decorator.FileStorageDecorator.utils.StorageUtils;

public class RawFileStorage implements  FileStorage{
    public void storeFile(String fileName,byte[] content){
        StorageUtils.store(fileName, content);
    }
    public byte[] getFile(String fileName){
        return StorageUtils.read(fileName);
    }
}
