package kr.ac.jejunu.fanal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "score_board")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    private long score;

}
