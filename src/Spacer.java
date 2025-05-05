public class Spacer extends Component {

        public Spacer(String name, Color color, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.color = color;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
        Storage.add(this);
    }

    public String getName() {
        return name;
    }

    public Spacer setName(String spacerName) {
        this.name = name;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Spacer setColor(Color color) {
        this.color = color;
        return this;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public Spacer setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public Spacer setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }


}
