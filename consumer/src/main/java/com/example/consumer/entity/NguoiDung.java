package com.example.consumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@Table(name = "VNA_NGUOIDUNG")
@NoArgsConstructor
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ten;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "ngaysinh")
    private LocalDate ngaySinh;
}
