import java.util.Objects;

public class Spacers {

    private String spacerName;
    private String spacerColor;
    private double bulkPrice;
    private int piecesPerBulk;
    private double pricePerPiece;

    public Spacers(String spacerName, String spacerColor, double bulkPrice, int piecesPerBulk) {
        this.spacerName = spacerName;
        this.spacerColor = spacerColor;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;
    }

    public String getSpacerName() {
        return spacerName;
    }

    public Spacers setSpacerName(String spacerName) {
        this.spacerName = spacerName;
        return this;
    }

    public String getSpacerColor() {
        return spacerColor;
    }

    public Spacers setSpacerColor(String spacerColor) {
        this.spacerColor = spacerColor;
        return this;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public Spacers setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public Spacers setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Spacers spacers)) return false;
        return Objects.equals(getSpacerName(), spacers.getSpacerName()) && Objects.equals(getSpacerColor(), spacers.getSpacerColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpacerName(), getSpacerColor());
    }
}
