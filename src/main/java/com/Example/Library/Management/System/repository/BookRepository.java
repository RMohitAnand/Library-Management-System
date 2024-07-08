package com.Example.Library.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Example.Library.Management.System.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
