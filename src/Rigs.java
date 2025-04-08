import java.util.Objects;

public class Rigs {

    private String rigsName;
    private String rigsColor;
    private double bulkPrice;
    private int piecesPerBulk;
    private double pricePerPiece;

    public Rigs (String rigsName, String rigsColor, double bulkPrice, int piecesPerBulk) {
        this.rigsName = rigsName;
        this.rigsColor = rigsColor;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
    }

    public String getRigsName() {
        return rigsName;
    }

    public Rigs setRigsName(String rigsName) {
        this.rigsName = rigsName;
        return this;
    }

    public String getRigsColor() {
        return rigsColor;
    }

    public Rigs setRigsColor(String rigsColor) {
        this.rigsColor = rigsColor;
        return this;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public Rigs setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public Rigs setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rigs rigs)) return false;
        return Objects.equals(getRigsName(), rigs.getRigsName()) && Objects.equals(getRigsColor(), rigs.getRigsColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRigsName(), getRigsColor());
    }
}
