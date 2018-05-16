package ir.serenade.uratana.domain;

import javax.persistence.*;

@Entity
public class Field {

    public  static enum FieldType {
        STRING, NUMERIC, DATE, BOOLEAN, BINARY
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "key_")
    private String key;

    private String value;

    @Enumerated(EnumType.STRING)
    private FieldType type;

    public Long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public FieldType getType() {
        return type;
    }
}
