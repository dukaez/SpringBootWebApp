package org.etsntesla.it.models;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import jakarta.persistence.*;

@Entity
@Table(name = "emocije")
public class Emocije {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Vrsta_emocije")
    @Enumerated(value = EnumType.STRING)
    private VrstaEmocije vrstaEmocije;

    @Column(name = "Poruka")
    private MysqlxDatatypes.Scalar.String poruka;

    public void setId(int id) {
        this.id = id;
    }

    public void setVrstaEmocije(VrstaEmocije vrstaEmocije) {
        this.vrstaEmocije = vrstaEmocije;
    }

    public void setPoruka(MysqlxDatatypes.Scalar.String poruka) {
        this.poruka = poruka;
    }
}