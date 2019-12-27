import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
class Gigasecond {
    LocalDateTime ss;
    Gigasecond(LocalDate moment) {
        moment = moment.plusDays(11574);
        ss = moment.atTime(1,46,40);
    }

    Gigasecond(LocalDateTime moment) {
        moment = moment.plusDays(11574);
        moment = moment.plusHours(1);
        moment = moment.plusMinutes(46);
        ss = moment.plusSeconds(40);
    }

    LocalDateTime getDateTime() {
        return ss;
    }

}
