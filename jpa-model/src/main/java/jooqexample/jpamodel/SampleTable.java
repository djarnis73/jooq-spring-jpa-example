package jooqexample.jpamodel;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SampleTable {

    @Id
    String id;

}
