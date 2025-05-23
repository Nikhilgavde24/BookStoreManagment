package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer>
{

}
