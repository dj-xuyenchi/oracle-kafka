package com.example.consumer.entitydao;

import com.example.consumer.entity.NguoiDung;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SoDoDTO {
    private Long id;
    private BigDecimal dienTich;
    private NguoiDung chuSoHuu;
}
