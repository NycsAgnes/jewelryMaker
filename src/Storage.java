import java.util.ArrayList;
import java.util.List;

public class Storage {

        public static void main(String[] args) {

// Ásvány gyöngyök
                Component aqua6 = new Bead("aquamarine", 6, 831.5, 57);
                Component aqua8 = new Bead("aquamarine", 8, 983.38, 42);
                Component tourmalinejade8 = new Bead("tourmalineJade", 8, 828.21, 45);
                Component obsidian8 = new Bead("blackObsidian", 8, 901.79, 45);
                Component garnet6 = new Bead("garnet", 6, 985.27, 61);
                Component garnet8 = new Bead("garnet", 8, 1137.43, 45);
                Component obsidian6 = new Bead("blackObsidian", 6, 985.27, 61);
                Component moon6 = new Bead("moonStone", 6, 909.18, 61);
                Component moon8 = new Bead("moonStone", 8, 985.27, 45);
                Component apatite6 = new Bead("apatite", 6, 909.18, 61);
                Component apatite8 = new Bead("apatite", 8, 1137.43, 45);
                Component bluey6 = new Bead("blueAmazonite", 6, 985.27, 61);
                Component amazonite6 = new Bead("mixedAmazonite", 6, 680.94, 61);
                Component amazonite8 = new Bead("mixedAmazonite", 8, 1212.08, 45);
                Component tourmaline6 = new Bead("tourmaline", 6, 680.94, 61);
                Component tourmaline8 = new Bead("tourmaline", 8, 1354.22, 45);
                Component colorfulTurquise8 = new Bead("colorfulTurqoise", 8, 864.65, 45);
                Component blackCrackedAgate8 = new Bead("blackCrackedAgate", 8, 1263.42, 45);
                Component pictureJasper8 = new Bead("pictureJasper", 8, 1310.79, 45);
                Component cracked8 = new Bead("crackedWhiteStone", 8, 1106.17, 45);

                ;

// Medálok
                Component gummyBears = new Charm("gummyBears", Color.MIXED, Material.RESIN, 755.57, 20);
                Component gummyHearts = new Charm("gummyHearts", Color.MIXED, Material.RESIN, 755.57, 20);
                Component smallBronzes = new Charm("smallBronzes", Color.ANTIQUE_BRONZE, Material.METAL, 875.65, 50);
                Component sewingCharms = new Charm("sewingCharms", Color.SILVER, Material.METAL, 785.69, 20);
                Component toolCharms = new Charm("toolCharms", Color.SILVER, Material.METAL, 706.72, 20);
                Component smallButterfly = new Charm("smallButterfly", Color.MIXED, Material.ALLOY, 878.06, 50);

                ;

// Akasztók
                Component smallRoundSilver = new PendantConnector("smallRoundSilver", Color.SILVER, Material.STEEL, 756.43, 30);
                Component smallRoundGold = new PendantConnector("smallRoundGold", Color.GOLD, Material.STEEL, 832.45, 30);

                ;

// Szerelékek
                Component earringRings = new Rig("earringRings", Color.SILVER, 755.57, 50);
                Component gridBoxEarringRigs = new Rig("gridBoxEarringRigs", Color.BRONZE, 1035.59, 700);
                Component bigRingedKitSilver = new Rig("bigRingedKit", Color.SILVER, 1338.43, 120);
                Component bigRingedKitGold = new Rig("bigRingedKit", Color.GOLD, 1180.50, 120);
                Component keychainRingWithChain = new Rig("keychainRingWithChain", Color.SILVER, 943.61, 50);
                Component turningConnector = new Rig("turningConnector", Color.BLACK_METAL, 1575.32, 250);
                Component steelBallPin25mm = new Rig("steelBallPin25mm", Color.SILVER, 706.72, 100);
                Component flatHeadPin50mm = new Rig("flatHeadPin50mm", Color.SILVER, 927.82, 200);

                ;

// Köztesek
                Component smallSquareBeads = new Spacer("smallSquareBeads", Color.SILVER, 795.68, 800);
                Component rondelle7 = new Spacer("rondelle", Color.SILVER, 627.76, 100);
                Component metalKnot = new Spacer("metalKnot", Color.SILVER, 655.4, 20);

                ;

// Csomagolóanyagok
                Component brownFolding = new Package("brownFolding", Material.PAPER, "4,5cm*12cm", 706.72, 50);
                Component BagWithThankYou = new Package("BagWithThankYou", Material.PLASTIC, "10cm*10cm", 706.72, 100);

                ;






        }

}
