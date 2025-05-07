public class Spacer extends Component {

        public Spacer(String name, Color color, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.color = color;
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

    public double getBulkPrice() {
        return bulkPrice;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public double getPricePerPiece() {return pricePerPiece;}

    public Spacer setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public Spacer setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }




}
