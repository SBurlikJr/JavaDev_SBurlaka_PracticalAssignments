package lv.tsi.car.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Car")
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @JsonProperty
    String model;

    @JsonProperty
    String brand;

    @JsonProperty
    int year;


}
