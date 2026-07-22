package main.java.oops.Cloud_Storage_Billing_And_File_Management;

public class DocumentFile extends StorageItem {
    private static final double RATE_PER_MB = 0.10; // $0.10 per MB

    public DocumentFile(String fileName, double sizeInMB) {
        super(fileName, sizeInMB);
    }

    @Override
    public double getRatePerMb() {
        return RATE_PER_MB;
    }
}
