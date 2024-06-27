package com.example.consumer.entitydao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NguoiDungDTO {
    private Long id;
    private String ten;
    private String diaChi;
    private LocalDate ngaySinh;
}
