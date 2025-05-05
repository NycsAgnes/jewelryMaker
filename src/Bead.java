import java.util.ArrayList;
import java.util.List;

public class Bead extends Component {

    public Bead (String name, int beadSize, double bulkPrice, int piecesPerBulk) {
        this.name = name;
        this.beadSize = beadSize;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
        storage.add(this);
    }

    public String getName() {
        return name;
    }

    public int getBeadSize() {
        return beadSize;
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

    public Bead setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public Bead setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

}
