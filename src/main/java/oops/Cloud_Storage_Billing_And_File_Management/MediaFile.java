package main.java.oops.Cloud_Storage_Billing_And_File_Management;

public class MediaFile extends StorageItem {
    private static final double RATE_PER_MB = 0.25; // $0.25 per MB

    public MediaFile(String fileName, double sizeInMB) {
        super(fileName, sizeInMB);
    }

    @Override
    public double getRatePerMb() {
        return RATE_PER_MB;
    }
    
}
