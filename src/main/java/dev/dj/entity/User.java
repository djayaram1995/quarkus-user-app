package dev.dj.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public")
@Getter
@Setter
public class User {

    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "user_id_seq")
    @GeneratedValue(generator = "userSeq")
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}
