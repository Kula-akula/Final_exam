package it.academy.FinalExam.Repository;

import it.academy.FinalExam.Entity.GetCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetCountRepo extends JpaRepository<GetCount, Long> {
}
