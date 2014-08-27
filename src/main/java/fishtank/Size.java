package fishtank;

public enum Size {
    XSMALL(1,"XSmall"),
    SMALL(2,"Small"),
    MEDIUM(3,"Medium"),
    LARGE(4,"Large"),
    XLARGE(5,"XLarge");

    private int size;
    private String name;

    Size(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public static Size getBySizeInt(int size) {
        for (Size s : values()) {
            if (s.getSize() == size) {
                return s;
            }
        }
        throw new IllegalArgumentException(String.valueOf(size));
    }
}
