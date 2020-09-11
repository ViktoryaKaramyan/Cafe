package Area;

import java.text.DateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public interface CafeLocation {

    static String displayCafeName(String cafeName){
        return cafeName;
    }

    static LocalTime cafeIsOpen(){
        return LocalTime.of(8,0,0);
    }

    static LocalTime cafeIsClose(){
        return LocalTime.of(0,0,0);
    }
}
