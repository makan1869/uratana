package ir.serenade.uratana.domain;

import javax.persistence.*;


@Entity
public class PurchasableItem extends BaseObject {


    public static enum PurchaseType {
        ONE_TIME,
        CONSUMABLE,
        TIME_BASED,
        VALIDITY_BASED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;

    @Enumerated(EnumType.STRING)
    private  PurchaseType type;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + "(" + id + ")";
    }


}
