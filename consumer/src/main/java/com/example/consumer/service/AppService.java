package com.example.consumer.service;

import com.example.consumer.entity.NguoiDung;
import com.example.consumer.entitydao.NguoiDungDTO;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppService {
    @KafkaListener(id = "group1", topics = "test-call-nguoi-dung")
    public void get(List<NguoiDungDTO> data) {
        for (var ng : data) {
            System.out.println(ng.getTen());
        }
    }
}
