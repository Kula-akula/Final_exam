package it.academy.FinalExam.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "counter_report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "post_counting")
    @GeneratedValue(strategy = GenerationType.AUTO)
    PostCount postCount;

    @Column(name = "get_counting")
    @GeneratedValue(strategy = GenerationType.AUTO)
    GetCount getCount;

}
