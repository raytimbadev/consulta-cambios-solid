package mz.co.fnb.database.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "provider")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Provider extends BaseEntity<String> implements Serializable {

    private String acronym;
}
