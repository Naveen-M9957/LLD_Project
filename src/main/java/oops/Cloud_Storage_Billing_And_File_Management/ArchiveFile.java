package main.java.oops.Cloud_Storage_Billing_And_File_Management;

public class ArchiveFile extends StorageItem {
    private static final double RATE_PER_MB = 0.05; // $0.05 per MB

    public ArchiveFile(String fileName, double sizeInMB) {
        super(fileName, sizeInMB);
    }

    @Override
    public double getRatePerMb() {
        return RATE_PER_MB;
    }
}