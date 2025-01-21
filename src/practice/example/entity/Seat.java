package practice.example.entity;

import java.util.Objects;

public class Seat {
    private long id; // 좌석 번호

    private String description; // 설명

    public Seat(long id) {
        this.id = id;
        this.description = id + "번 좌석";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat seat)) return false;
        
        return id == seat.id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
