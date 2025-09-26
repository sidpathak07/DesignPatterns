package Decorator.FileStorageDecorator;

public class Client {
    public static void main(String[] args) {
        // Step 1: Create the base raw storage
        FileStorage rawStorage = new RawFileStorage();

        // Step 2: Wrap it with compression
        FileStorage compressedStorage = new CompressionDecorator(rawStorage);

        // Step 3: Wrap it again with virus scanning
        FileStorage secureStorage = new VirusScanningDecorator(compressedStorage);

        // Now we have a chain:
        // VirusScanningDecorator -> CompressionDecorator -> RawFileStorage

        String fileName = "document.txt";
        byte[] fileContent = "Hello Decorator Pattern!".getBytes();

        // Store the file (Virus scanning → compression → raw storage)
        secureStorage.storeFile(fileName, fileContent);

        // Read the file (raw storage → decompression → virus scanning)
        byte[] retrieved = secureStorage.getFile(fileName);

        System.out.println("Retrieved content: " + new String(retrieved));
    }
}
