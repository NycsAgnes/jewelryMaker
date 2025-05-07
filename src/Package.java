public class Package extends Component {


    public Package(String name, Material material, String packageSize, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.material = material;
        this.packageSize = packageSize;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
    }

    public String getName() {
        return name;
    }

    public Package setName(String packageName) {
        this.name = name;
        return this;
    }

    public Material getMaterial() {
        return material;
    }

    public Package setMaterial(Material material) {
        this.material = material;
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
        return this.pricePerPiece;
    }

}
