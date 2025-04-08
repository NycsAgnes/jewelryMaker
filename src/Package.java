import java.util.Objects;

public class Package {

    private String packageName;
    private String packageMaterial;
    private String packageSize;
    private double bulkPrice;
    private int piecesPerBulk;
    private double pricePerPiece;

    public Package(String packageName, String packageMaterial, String packageSize, double bulkPrice, int piecesPerBulk) {
        this.packageName = packageName;
        this.packageMaterial = packageMaterial;
        this.packageSize = packageSize;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
    }

    public String getPackageName() {
        return packageName;
    }

    public Package setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String getPackageMaterial() {
        return packageMaterial;
    }

    public Package setPackageMaterial(String packageMaterial) {
        this.packageMaterial = packageMaterial;
        return this;
    }

    public String getPackageSize() {
        return packageSize;
    }

    public Package setPackageSize(String packageSize) {
        this.packageSize = packageSize;
        return this;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public Package setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public Package setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Package aPackage)) return false;
        return Objects.equals(getPackageName(), aPackage.getPackageName()) && Objects.equals(getPackageMaterial(), aPackage.getPackageMaterial()) && Objects.equals(getPackageSize(), aPackage.getPackageSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPackageName(), getPackageMaterial(), getPackageSize());
    }
}
