import java.util.ArrayList;
import java.util.List;

public class Bead extends Component {

    private int beadSize;

    public Bead (String name, int beadSize, double bulkPrice, int piecesPerBulk) {
        super(name, piecesPerBulk, bulkPrice);
        this.beadSize = beadSize;
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
