public class PendantConnector extends Component{

    public PendantConnector(String name, Color color, Material material, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.color = color;
        this.material = material;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    public PendantConnector setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public PendantConnector setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

}
