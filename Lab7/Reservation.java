import java.sql.SQLException;
import java.time.LocalDate;

public class Reservation {
    int Code;
    String Room;
    LocalDate CheckIn;
    LocalDate CheckOut;
    float Rate;
    String LastName;
    String FirstName;
    int Adults;
    int Kids;

    public Reservation(java.sql.ResultSet rs) throws SQLException {
        Code = rs.getInt("Code");
        Room = rs.getString("Room");
        CheckIn = LocalDate.parse(rs.getString("CheckIn"));
        CheckOut = LocalDate.parse(rs.getString("CheckOut"));
        Rate = rs.getFloat("Rate");
        LastName = rs.getString("LastName");
        FirstName = rs.getString("FirstName");
        Adults = rs.getInt("Adults");
        Kids = rs.getInt("Kids");
    }

    public Reservation(int code, String room, LocalDate checkIn, LocalDate checkOut, float rate, String lastName, String firstName, int adults, int kids) {
        Code = code;
        Room = room;
        CheckIn = checkIn;
        CheckOut = checkOut;
        Rate = rate;
        LastName = lastName;
        FirstName = firstName;
        Adults = adults;
        Kids = kids;
    }
}
