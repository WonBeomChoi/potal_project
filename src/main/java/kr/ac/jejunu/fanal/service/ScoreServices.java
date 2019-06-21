package kr.ac.jejunu.fanal.service;

import kr.ac.jejunu.fanal.model.ScoreBoard;
import kr.ac.jejunu.fanal.repository.ScoreBoardRepository;
import kr.ac.jejunu.fanal.repository.UserRepository;
import kr.ac.jejunu.fanal.vo.ScoreBoardPayLoad;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScoreServices {

    private final UserRepository userRepository;
    private final ScoreBoardRepository scoreBoardRepository;

    public ScoreBoard add_score(ScoreBoardPayLoad scoreBoardPayLoad) throws IllegalAccessException {
        ScoreBoard scoreBoard = ScoreBoard.builder()
                .score(scoreBoardPayLoad.getScore())
                .user(userRepository.findById(scoreBoardPayLoad.getUser_id()).orElseThrow(IllegalAccessException::new))
                .build();
        return scoreBoardRepository.save(scoreBoard);
    }
    public List<ScoreBoard> get_score_list(Long id){
        return scoreBoardRepository.findAllByuserId(id);
    }
//    public Page<ScoreBoard> get_socre_page(){
//
//    }
}
