package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecordController {

    @Autowired
    private RecordRepository repository;

    @GetMapping("/records")
    public List<Record> getRecords(@RequestParam(defaultValue = "0") int page) {
        return repository.findAll(PageRequest.of(page, 1000)).getContent();
    }
}
