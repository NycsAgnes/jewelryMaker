public class Rig extends Component {

    public Rig(String name, Color color, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.color = color;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
        storage.add(this);
    }

    public String getName() {
        return name;
    }

    public Rig setName(String name) {
        this.name = name;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Rig setColor(Color color) {
        this.color = color;
        return this;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public Rig setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public Rig setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

}
