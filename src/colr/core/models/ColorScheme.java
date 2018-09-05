package colr.core.models;

import java.io.Serializable;

public class ColorScheme implements Serializable {
    public static final Color TRANSPARENT   = new Color(0x00000000);
    public static final Color BLACK         = new Color(0xFF000000);
    public static final Color WHITE         = new Color(0xFFFFFFFF);

    public ColorScheme() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
