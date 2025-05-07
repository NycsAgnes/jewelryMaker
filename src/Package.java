public class Package extends Component {


    public Package(String name, Material material, String packageSize, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.material = material;
        this.packageSize = packageSize;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
        addToStorage();
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    public String getPackageSize() {
        return packageSize;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public double getPricePerPiece() {
        return this.pricePerPiece;
    }

    public Package setPackageSize(String packageSize) {
        this.packageSize = packageSize;
        return this;
    }

    public Package setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public Package setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public void addToStorage (){
        Main.storage.add(this);
    }



}
