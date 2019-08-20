package com.learn.hibernate.HibernateDemo.reposatory;

import com.learn.hibernate.HibernateDemo.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteReposatory extends JpaRepository<Note, Long> {
}
