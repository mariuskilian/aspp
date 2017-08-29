/**
 * Created by marius on 27/08/2017.
 */
public enum TeamList {

    Team001(1, "Borussia Dortmund", "BVB"),
    Team002(2, "FC Bayern Muenchen", "FCB"),
    Team003(3, "Hamburger SV", "HSV"),
    Team004(4, "Borussia Moenchengladbach", "BMG"),
    Team005(5, "TSG 1899 Hoffenheim", "TSG"),
    Team006(6, "Sport-Club Freiburg", "SCF"),
    Team007(7, "FC Schalke 04", "S04"),
    Team008(8, "Hannover 96", "H96"),
    Team009(9, "Hertha BSC ", "BSC"),
    Team010(10, "VfB Stuttgart", "VFB"),
    Team011(11, "VfL Wolfsburg", "WOB"),
    Team012(12, "FC Augsburg", "FCA"),
    Team013(13, "Eintracht Frankfurt", "SGE"),
    Team014(14, "Bayer 04 Leverkusen", "B04"),
    Team015(15, "1. FSV Mainz 05", "M05"),
    Team016(16, "1. FC Koeln", "KOE"),
    Team017(17, "RB Leipzig", "RBL"),
    Team018(18, "SV Werder Bremen", "SVW"),
    Team019(19, "Fortuna Duesseldorf", "F95"),
    Team020(20, "SV Darmstadt 98", "S98"),
    Team021(21, "DSC Arminia Bielefeld", "DSC"),
    Team022(22, "1. FC Union Berlin", "FCU"),
    Team023(23, "SV Sandhausen", "SVS"),
    Team024(24, "Holstein Kiel", "KIE"),
    Team025(25, "1. FC Nuernberg", "FCN"),
    Team026(26, "FC St. Pauli", "STP"),
    Team027(27, "Eintracht Braunschweig", "EBS"),
    Team028(28, "FC Erzgebirge Aue", "AUE"),
    Team029(29, "MSV Duisburg", "MSV"),
    Team030(30, "VfL Bochum 1848", "BOC"),
    Team031(31, "SG Dynamo Dresden", "SGD"),
    Team032(32, "SSV Jahn Regensburg", "REG"),
    Team033(33, "1. FC Heidenheim 1846", "FCH"),
    Team034(34, "FC Ingolstadt 04", "FCI"),
    Team035(35, "1. FC Kaiserslautern", "FCK"),
    Team036(36, "SpVgg Greuther Fuerth", "SGF");

    private final int index;
    private final String name;
    private final String abbr;

    TeamList(int index, String name, String abbr) {
        this.index = index;
        this.name = name;
        this.abbr = abbr;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getAbbr() {
        return abbr;
    }


}
