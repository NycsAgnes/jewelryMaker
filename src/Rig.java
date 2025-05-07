public class Rig extends Component {

    public Rig(String name, Color color, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.color = color;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
        addToStorage();
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

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    public Rig setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public Rig setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public void addToStorage (){
        Main.storage.add(this);
    }

}
