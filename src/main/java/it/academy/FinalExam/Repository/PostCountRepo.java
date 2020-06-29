package it.academy.FinalExam.Repository;

import it.academy.FinalExam.Entity.PostCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCountRepo extends JpaRepository<PostCount,Long> {
}
