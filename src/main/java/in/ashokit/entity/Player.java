package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CRICKET_PLAYER")
public class Player {
 
@Id
@Column (name="PLAYER_ID")
private Integer playerId;
@Column (name="PLAYER_NAME")
private String playerName;
@Column (name="PLAYER_AGE")
private Integer playerAge;
private String location;

}
