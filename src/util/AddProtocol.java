package util;

public class AddProtocol {
    public static String addProtocol(String url) {
        if (url == null) return null;
        if (url.startsWith("https://") || url.startsWith("http://")) return url;
        else return "https://" + url;
    }
}
