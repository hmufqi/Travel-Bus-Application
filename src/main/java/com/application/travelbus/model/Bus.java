package com.application.travelbus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nama_supir")
    private String nama_supir;

    @Column(name = "nomor_polisi")
    private String nomor_polisi;

    @Column(name = "kelas_bus")
    private String kelas_bus;
}
