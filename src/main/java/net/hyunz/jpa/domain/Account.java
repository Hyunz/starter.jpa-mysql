package net.hyunz.jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Account {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
}
