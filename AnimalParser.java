package jacob.zoo.com;

public class AnimalParser {
    public static int findAge(String line) {
        String[] section1Array = LineSplitter.section1Array(line);
        return Integer.parseInt(section1Array[0]);
    }

    public static String findSex(String line) {
        String[] section1Array = LineSplitter.section1Array(line);
        return section1Array[3];
    }

    public static String findSpecies(String line) {
        String[] section1Array = LineSplitter.section1Array(line);
        return  section1Array[4];
    }

    public static String findSeasonBorn(String line) {
        String[] section2Array = LineSplitter.section2Array(line);
        return section2Array[3];
    }

    public static String findColor (String line) {
        String[] lineArray = LineSplitter.lineArray(line);
        return lineArray[2].substring(1, lineArray[2].indexOf("color") - 1);
    }

    public static String findWeight(String line) {
        String[] lineArray = LineSplitter.lineArray(line);
        return lineArray[3].substring(1);
    }

    public static String findOrigen(String line) {
        String[] lineArray = LineSplitter.lineArray(line);
        return lineArray[4].substring(6) + "," + lineArray[5];
    }
}
