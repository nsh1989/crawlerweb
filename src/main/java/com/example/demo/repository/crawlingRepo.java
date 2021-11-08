package com.example.demo.repository;

import com.example.demo.entity.encarlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface crawlingRepo extends JpaRepository<encarlist, Integer>{
}
