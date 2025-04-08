import java.util.Objects;

public class Charms {

    private String charmName;
//    String charmColor = ;
    private String charmMaterial;
    private double bulkPrice;
    private int piecesPerBulk;
    private double pricePerPiece;

//    public Charms(String charmName, Options charmColor, String charmMaterial, double bulkPrice, int piecesPerBulk) {
//        this.charmName = charmName;
//        this.charmColor = ;
//        this.charmMaterial = charmMaterial;
//        this.bulkPrice = bulkPrice;
//        this.piecesPerBulk = piecesPerBulk;
//        this.pricePerPiece = bulkPrice / piecesPerBulk;
//    }

    public String getCharmName() {
        return charmName;
    }

    public Charms setCharmName(String charmName) {
        this.charmName = charmName;
        return this;
    }

//    public String getCharmColor() {
//        return charmColor;
//    }
//
//    public Charms setCharmColor(String charmColor) {
//        this.charmColor = charmColor;
//        return this;
//    }

    public String getCharmMaterial() {
        return charmMaterial;
    }

    public Charms setCharmMaterial(String charmMaterial) {
        this.charmMaterial = charmMaterial;
        return this;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public Charms setBulkPrice(double bulkPrice) {
        this.bulkPrice = bulkPrice;
        return this;
    }

    public int getPiecesPerBulk() {
        return piecesPerBulk;
    }

    public Charms setPiecesPerBulk(int piecesPerBulk) {
        this.piecesPerBulk = piecesPerBulk;
        return this;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Charms charms)) return false;
//        return Objects.equals(getCharmName(), charms.getCharmName()) && Objects.equals(getCharmColor(), charms.getCharmColor()) && Objects.equals(getCharmMaterial(), charms.getCharmMaterial());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getCharmName(), getCharmColor(), getCharmMaterial());
//    }
}

