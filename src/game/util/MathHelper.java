package game.util;

public class MathHelper {
    
    public static double median(int a, int b, int c) {
        return (a<=b)?((b<=c)?b:((a<c)?c:a)):((a<=c)?a:((b<c)?c:b));
    }
}