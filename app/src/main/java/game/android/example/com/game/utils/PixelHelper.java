package game.android.example.com.game.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * @author Iustin
 * @date 9/28/2018
 */
public class PixelHelper {
    public static int pixelsToDp(int px, Context context) {
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, px,
                context.getResources().getDisplayMetrics());
    }
}
