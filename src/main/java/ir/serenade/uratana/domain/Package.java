package ir.serenade.uratana.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Package extends BaseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "package_items", joinColumns = { @JoinColumn(name = "package_id") },
            inverseJoinColumns = { @JoinColumn(name = "item_id") })
    private Set<PurchasableItem> items;

    private Double price = 0.0;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<PurchasableItem> getItems() {
        return items;
    }

    public Double getPrice() {
        return price;
    }
}
