package kr.ac.jejunu.fanal.service;

import kr.ac.jejunu.fanal.model.ScoreBoard;
import kr.ac.jejunu.fanal.repository.ScoreBoardRepository;
import org.springframework.data.domain.Page;

import java.util.List;

public class ScoreServices {

    public ScoreBoard add_score(ScoreBoard scoreBoard, ScoreBoardRepository scoreBoardRepository){
        return scoreBoardRepository.save(scoreBoard);
    }
    public List<ScoreBoard> get_score_list(Long id, ScoreBoardRepository scoreBoardRepository){
        return scoreBoardRepository.findAllByuserId(id);
    }
//    public Page<ScoreBoard> get_socre_page(){
//
//    }
}
