package Decorator.FileStorageDecorator;

import Decorator.FileStorageDecorator.utils.StorageUtils;
import Decorator.FileStorageDecorator.utils.VirusDetectedException;

public class VirusScanningDecorator extends BaseFileDecorator{
    private final FileStorage nextLayer;
    public VirusScanningDecorator(FileStorage fileStorage){
        super(fileStorage);
        this.nextLayer=fileStorage;
    }
    public void storeFile(String fileName,byte[] content){
        if(!StorageUtils.scanForVirus(content)){
            throw new VirusDetectedException("Virus detected");
        }
        nextLayer.storeFile(fileName, content);
    }
    public byte[] getFile(String fileName){
        byte[] file = nextLayer.getFile(fileName);
        if (!StorageUtils.scanForVirus(file)) {
            throw new IllegalStateException("Virus detected! Cannot read file.");
        }
        return file;
    }
}
