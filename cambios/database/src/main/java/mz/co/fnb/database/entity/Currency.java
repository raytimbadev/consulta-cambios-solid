package mz.co.fnb.database.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "currency")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Currency extends BaseEntity<String> implements Serializable {

    private String acronym;

}
