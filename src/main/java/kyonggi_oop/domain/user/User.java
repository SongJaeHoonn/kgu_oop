package kyonggi_oop.domain.user;

import kyonggi_oop.domain.seat.Seat;

import java.util.Optional;

public class User {

    private String studentId;
    private Optional<Seat> seat;

    public User(String studentId) {
        this.studentId = studentId;
        this.seat = Optional.empty();
    }

    public Seat returnSeat() {
        Seat usedSeat = getSeat();
        seat = Optional.empty();

        return usedSeat;
    }

    public boolean isUsingSeat() {
        return seat.isPresent();
    }

    public String getStudentId() {
        return studentId;
    }

    public Seat getSeat() {
        return seat.orElseThrow(() -> new IllegalStateException("사용자가 좌석을 사용하고 있지 않습니다."));
    }

    public void setSeat(Seat seat) {
        this.seat = Optional.ofNullable(seat);
    }
}
