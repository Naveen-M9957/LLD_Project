package main.java.oops.Cloud_Storage_Billing_And_File_Management;

public abstract class StorageItem implements Archivable{
    private static int idCounter = 0;
    private final String fileId;
    private final String fileName;
    private double sizeInMB;
    private boolean isAvailable;

    public StorageItem(String fileName, double sizeInMB) {
        if(sizeInMB < 0) {
            throw new InvalidFileSizeException("Size must be a positive value");
        }
        this.fileId = generateFileId();
        this.fileName = fileName;
        this.sizeInMB = sizeInMB;
        this.isAvailable = true;
    }

    protected String generateFileId() {
        return "F-" + (++idCounter);
    }

    public int getTotalFiles() {
        return idCounter;
    }

    public String getFileId() {
        return fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public double getSizeInMB() {
        return sizeInMB;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setSizeInMB(double sizeInMB) {
        if(sizeInMB < 0) {
            throw new InvalidFileSizeException("Size must be greater than 0");
        }
        this.sizeInMB = sizeInMB;
    }

    public double calculateStorageCost() {
        return sizeInMB * getRatePerMb();
    }

    public abstract double getRatePerMb();

    @Override
    public void Archive() {
        this.isAvailable = false;
    }

    @Override
    public void Restore() {
        this.isAvailable = true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StorageItem that = (StorageItem) obj;
        return fileId.equals(that.fileId);
    }

    @Override
    public int hashCode() {
        return fileId.hashCode();
    }

}
