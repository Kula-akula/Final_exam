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
@Table(name = "post_count")
public class PostCount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "post_counting")
    @GeneratedValue(strategy = GenerationType.AUTO)
    PostCount postCount;

    @Column
    Date createDate= new Date();
}
