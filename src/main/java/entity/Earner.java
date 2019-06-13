package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "earner")
public class Earner {

    @Id
    @GeneratedValue(generator = "sequence_earner_id", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequenceName = "earner_sequence", name = "sequence_earner_id")
    private long id;

    @OneToMany(mappedBy = "earner")
    List<Tool> list = new ArrayList<>();

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setList(List<Tool> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tool> getList() {
        return list;
    }


}
