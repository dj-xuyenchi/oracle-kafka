package com.example.consumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "VNA_SODO")
public class SoDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dientich")
    private BigDecimal dienTich;
    @ManyToOne
    @JoinColumn(name = "chusohuuid")
    private NguoiDung chuSoHuu;
}
