package cleancode.naming.staticfactory;

public class Color {
    private final int hex;
    static Color makeFromRGB(String rgb) {
        return new Color(Integer.parseInt(rgb, 16));
    }
    static Color makeFromPalette(int red, int green, int blue) {
        return new Color(red << 16 + green << 8 + blue);
    }
    static Color makeFromHex(int h) {
        return new Color(h);
    }
    private Color(int h) {
        this.hex = h;
    }
}

class Color1 {
    private final int h;

    public Color1(String rgb) {
        this(Integer.parseInt(rgb, 16));
    }
    public Color1(int red, int green, int blue ) {
        this(red << 16 + green << 8 + blue);
    }
    public Color1(int h) {
        this.h = h;
    }
}


