public enum CoffeeSize{
    // Constants
    SMALL("S", 240),
    MEDIUM("M", 350),
    LARGE("L", 470),
    EXTRA_LARGE("XL", 590);

    private String abbreviation;
    private int volume;  

    private CoffeeSize(String abbreviation, int volume) {
        this.abbreviation = abbreviation;
        this.volume = volume;
    }

    // method getAbbreviation --> return abbreviation as string
    public String getAbbreviation() {
        return this.abbreviation; 
    }

    // method getVolume --> return volume as int
    public int getVolume() {
        return this.volume; 
    }

    public static CoffeeSize ofAbbreviation(String abbr) {
        for (CoffeeSize s : values()) {
            if (s.abbreviation.equals(abbr)) {
                return s; 
            }
        }
        return null; // no matching constant found
    }
}