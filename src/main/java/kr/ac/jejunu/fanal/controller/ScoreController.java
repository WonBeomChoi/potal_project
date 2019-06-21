package kr.ac.jejunu.fanal.controller;

import kr.ac.jejunu.fanal.model.ScoreBoard;
import kr.ac.jejunu.fanal.repository.ScoreBoardRepository;
import kr.ac.jejunu.fanal.service.ScoreServices;
import kr.ac.jejunu.fanal.vo.ScoreBoardPayLoad;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
@RequiredArgsConstructor
public class ScoreController {
//    @PageableDefault(sort = {"score"}, direction = Sort.Direction.DESC, size = 10)
    private final ScoreBoardRepository scoreBoardRepository;
    private final ScoreServices scoreServices;


    @PostMapping(value="/addScore", consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ScoreBoard sCreate(@RequestBody ScoreBoardPayLoad scoreBoardPayLoad){
        try {
            return scoreServices.add_score(scoreBoardPayLoad);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

}
