package com.learn.hibernate.HibernateDemo.controller;

import com.learn.hibernate.HibernateDemo.entity.Note;
import com.learn.hibernate.HibernateDemo.reposatory.NoteReposatory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("api")
public class NoteController {

  // Logger logger =  LoggerFactory.getLogger(NoteController.class);
   Logger logger = LogManager.getContext(false).getLogger("JDBC_Logger");


    @Autowired
    NoteReposatory noteReposatory;

    @GetMapping("notes")
    public List<Note> getAllNote(){
        logger.info("getAllNote");
        try{
         int i = 10/0;
        }catch(Exception ex){
            logger.error("exception", ex);
        }
        return noteReposatory.findAll();
    }
    @PostMapping("note")
    public Note createNote(@Valid @RequestBody Note note){
        logger.info("createNote");
        return noteReposatory.save(note);
    }
    public Optional<Note> getNoteById(@PathVariable(value = "id") Long noteId){
        return noteReposatory.findById(noteId);
    }

}
