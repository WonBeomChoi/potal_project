package kr.ac.jejunu.fanal.model;


import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userid;
    private String name;
    private String password;
}
