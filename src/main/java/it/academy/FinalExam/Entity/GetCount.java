package it.academy.FinalExam.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "get_count")
public class GetCount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "get_counting")
    @GeneratedValue(strategy = GenerationType.AUTO)
    GetCount getCount;

    @Column
    Date createDate= new Date();

}
