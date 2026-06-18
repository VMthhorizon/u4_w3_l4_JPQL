package vincenzomola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue
    private UUID location_id;
    private String location_name;
    private String location_city;

    protected Location() {
    }

    public Location(String location_name, String location_city) {
        this.location_name = location_name;
        this.location_city = location_city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + location_id +
                ", location_name='" + location_name + '\'' +
                ", location_city='" + location_city + '\'' +
                '}';
    }
}
