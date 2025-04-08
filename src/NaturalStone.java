import java.util.Objects;

public class NaturalStone {

    private String naturalStoneName;
    private int sizeInMillimeters;
    private double bulkPrice;
    private int piecesPerBulk;
    private double pricePerPiece;


    public NaturalStone(String naturalStoneName, int sizeInMillimeters, double bulkPrice, int piecesPerBulk) {
        this.naturalStoneName = naturalStoneName;
        this.sizeInMillimeters = sizeInMillimeters;
        this.bulkPrice = bulkPrice;
        this.piecesPerBulk = piecesPerBulk;
        this.pricePerPiece = bulkPrice / piecesPerBulk;

    }

    public String getNaturalStoneName() {
        return naturalStoneName;
    }

    public NaturalStone setNaturalStoneName(String naturalStoneName) {
        this.naturalStoneName = naturalStoneName;
        return this;
    }

    public int getSizeInMillimeters() {
        return sizeInMillimeters;
    }

    public NaturalStone setSizeInMillimeters(int sizeInMillimeters) {
        this.sizeInMillimeters = sizeInMillimeters;
        return this;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public NaturalStone setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public NaturalStone setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NaturalStone beads)) return false;
        return getSizeInMillimeters() == beads.getSizeInMillimeters() && Objects.equals(getNaturalStoneName(), beads.getNaturalStoneName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaturalStoneName(), getSizeInMillimeters());
    }


}
