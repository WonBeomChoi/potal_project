package kr.ac.jejunu.fanal.controller;

import kr.ac.jejunu.fanal.model.ScoreBoard;
import kr.ac.jejunu.fanal.repository.ScoreBoardRepository;
import kr.ac.jejunu.fanal.service.ScoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class ScoreController {
//    @PageableDefault(sort = {"score"}, direction = Sort.Direction.DESC, size = 10)
    @Autowired
    private final ScoreBoardRepository scoreBoardRepository;
    ScoreServices scoreServices;

    public ScoreController(ScoreBoardRepository scoreBoardRepository) {
        this.scoreBoardRepository = scoreBoardRepository;
    }

    @PostMapping(value="/addScore", consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ScoreBoard sCreate(@RequestBody ScoreBoard scoreBoard){
        scoreServices = new ScoreServices();
        return scoreServices.add_score(scoreBoard, scoreBoardRepository);
    }

}
