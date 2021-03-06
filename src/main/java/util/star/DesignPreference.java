package util.star;

public class DesignPreference {
    private String themeColor;
    private String heavyColor;
    private String lightColor;

    public DesignPreference() {
    }
    public DesignPreference(String themeColor) {
        this.themeColor = themeColor;
        setLighterHeavier();
    }



    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
        setLighterHeavier();
    }

    private void setLighterHeavier () {
        lightColor= "#";
        heavyColor = "#";
        for (int i = 0; i < 3; i++) {
            int c = Integer.parseInt(themeColor.substring(1+i*2,3+i*2), 16);
            int lightC = 255 - (int)((255-c) * 0.3);
            int heavyC = (int)(c * 0.7);
            lightColor += twoDigit(Integer.toHexString(lightC));
            heavyColor += twoDigit(Integer.toHexString(heavyC));
        }

    }
    private String twoDigit(String c){
        if (c.length() == 2) return c;
        if (c.length() == 1) return "0"+c;
        else  return "ff";
    }

    public String getHeavyColor() {
        return heavyColor;
    }

    public void setHeavyColor(String heavyColor) {
        this.heavyColor = heavyColor;
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
    }




}
