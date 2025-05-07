import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    String name;
    double bulkPrice;
    int piecesPerBulk;
    double pricePerPiece;

    //TODO a leszármazó osztályok konstruktorait aktualizálni

    public Component(String name, int piecesPerBulk, double bulkPrice) {
        this.name = name;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
        this.piecesPerBulk = piecesPerBulk;
        this.bulkPrice = bulkPrice;
    }
}
