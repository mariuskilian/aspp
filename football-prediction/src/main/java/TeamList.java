/**
 * Created by marius on 27/08/2017.
 */
public enum TeamList {

    Team001("Borussia Dortmund", "BVB"),
    Team002("FC Bayern Muenchen", "FCB"),
    Team003("Hamburger SV", "HSV"),
    Team004("Borussia Moenchengladbach", "BMG"),
    Team005("TSG 1899 Hoffenheim", "TSG"),
    Team006("Sport-Club Freiburg", "SCF"),
    Team007("FC Schalke 04", "S04"),
    Team008("Hannover 96", "H96"),
    Team009("Hertha BSC ", "BSC"),
    Team010("VfB Stuttgart", "VFB"),
    Team011("VfL Wolfsburg", "WOB"),
    Team012("FC Augsburg", "FCA"),
    Team013("Eintracht Frankfurt", "SGE"),
    Team014("Bayer 04 Leverkusen", "B04"),
    Team015("1. FSV Mainz 05", "M05"),
    Team016("1. FC Koeln", "KOE"),
    Team017("RB Leipzig", "RBL"),
    Team018("SV Werder Bremen", "SVW"),
    Team019("Fortuna Duesseldorf", "F95"),
    Team020("SV Darmstadt 98", "S98"),
    Team021("DSC Arminia Bielefeld", "DSC"),
    Team022("1. FC Union Berlin", "FCU"),
    Team023("SV Sandhausen", "SVS"),
    Team024("Holstein Kiel", "KIE"),
    Team025("1. FC Nuernberg", "FCN"),
    Team026("FC St. Pauli", "STP"),
    Team027("Eintracht Braunschweig", "EBS"),
    Team028("FC Erzgebirge Aue", "AUE"),
    Team029("MSV Duisburg", "MSV"),
    Team030("VfL Bochum 1848", "BOC"),
    Team031("SG Dynamo Dresden", "SGD"),
    Team032("SSV Jahn Regensburg", "REG"),
    Team033("1. FC Heidenheim 1846", "FCH"),
    Team034("FC Ingolstadt 04", "FCI"),
    Team035("1. FC Kaiserslautern", "FCK"),
    Team036("SpVgg Greuther Fuerth", "SGF");

    private final String name;
    private final String abbr;

    TeamList(String name, String abbr) {
        this.name = name;
        this.abbr = abbr;
    }

    public String getName() {
        return name;
    }

    public String getAbbr() {
        return abbr;
    }

}
