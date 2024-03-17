package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "temp_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TempData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

    @Column(name ="code")
    String code;

    @Column(name="no_pty")
    Long noPty;

    @Column(name="qty")
    Long qty;

    @Column(name ="proses")
    String proses;

    @Column(name ="date_update")
    LocalDate dateUpdate;

    @PrePersist()
    public void prePresist(){
        if (dateUpdate == null){
            dateUpdate = LocalDate.now();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getNoPty() {
        return noPty;
    }

    public void setNoPty(Long noPty) {
        this.noPty = noPty;
    }

    public String getProses() {
        return proses;
    }

    public void setProses(String proses) {
        this.proses = proses;
    }

    public TempData(long l, String gmb, long l1) {

        this.id = l;
        this.code = gmb;
        this.noPty=l1;

    }
}
