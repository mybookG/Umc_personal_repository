package com.example.demo.domain.store.controller;

import com.example.demo.domain.store.dto.StoreResDTO;
import com.example.demo.global.apiPayload.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StoreController {
    @PostMapping("/save-stoer")
    public ApiResponse<StoreResDTO.JoinDTO> saveStore(
            @RequestBody StoreResDTO.JoinDTO dto)
    {
        return null;
    }
}
