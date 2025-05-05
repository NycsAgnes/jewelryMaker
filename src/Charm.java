public class Charm extends Component {

    public Charm (String name, Color color, Material material, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.color = color;
        this.material = material;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
        storage.add(this);
    }

    public String getName() {return name;}

    public Color getColor() {return color;}

    public Material getMaterial() {
        return material;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public int getPiecesPerBulk() {return piecesPerBulk;}

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    public Charm setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public Charm setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }
    public Charm addElement() {
        storage.add(this);
    }

}



