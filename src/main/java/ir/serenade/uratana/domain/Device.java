package ir.serenade.uratana.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String deviceId;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
