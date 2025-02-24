package com.github.acnaweb.study_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    public ResponseEntity<String> demo(){
        return ResponseEntity.status(203).body("Mensagem teste");
    }
    @PostMapping
    public ResponseEntity<String> create(){
        return ResponseEntity.status(201).body("Produto cadastrado: maça");
    }

    @PutMapping
    public ResponseEntity<String> update() {
        return ResponseEntity.status(200).body("Produto atualizado");
    }

    @GetMapping
    public ResponseEntity<String> find(){
        return ResponseEntity.status(200).body("Maça");
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(){
        return ResponseEntity.status(204).build();
    }
}
