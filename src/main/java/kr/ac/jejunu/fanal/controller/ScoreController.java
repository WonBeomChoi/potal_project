package kr.ac.jejunu.fanal.controller;

import kr.ac.jejunu.fanal.model.ScoreBoard;
import kr.ac.jejunu.fanal.repository.ScoreBoardRepository;
import kr.ac.jejunu.fanal.service.ScoreServices;
import kr.ac.jejunu.fanal.vo.ScoreBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
@RequiredArgsConstructor
public class ScoreController {
//    @PageableDefault(sort = {"score"}, direction = Sort.Direction.DESC, size = 10)
    private final ScoreBoardRepository scoreBoardRepository;
    private final ScoreServices scoreServices;

    @PostMapping(value="/addScore", consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ScoreBoard sCreate(@RequestBody ScoreBoardVO scoreBoardVO){
        try {
            return scoreServices.add_score(scoreBoardVO);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

}
