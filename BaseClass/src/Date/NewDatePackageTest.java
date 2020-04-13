package Date;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class NewDatePackageTest {
    public static void main(String[] args) {
        System.out.println("=======");
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());
        System.out.println("=======");
        Duration d = Duration.ofSeconds(60000);
        System.out.println("分："+d.toMinutes());
        System.out.println("时："+d.toHours());
        System.out.println("秒："+d.toSeconds());
        Clock c = Clock.offset(clock, d);
        System.out.println(c.instant());
        System.out.println("========");
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant1 = instant.plusSeconds(60000);
        System.out.println(instant1);
    }
}
