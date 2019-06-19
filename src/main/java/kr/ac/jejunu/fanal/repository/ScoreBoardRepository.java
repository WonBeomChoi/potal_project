package kr.ac.jejunu.fanal.repository;

import kr.ac.jejunu.fanal.model.ScoreBoard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScoreBoardRepository extends JpaRepository<ScoreBoard, Long> {
//    @Query("SELECT s FROM ScoreBoard s WHERE s.user.id = :id")
    List<ScoreBoard> findAllByuserId(Long userId);
    Page<ScoreBoard> findAll(Pageable pageable);

}
