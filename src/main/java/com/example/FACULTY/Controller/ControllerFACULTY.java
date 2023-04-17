package com.example.FACULTY.Controller;
3
import com.example.FACULTY.Entity.FACULTY;
import com.example.FACULTY.Service.ServiceFACULTY;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@AllArgsConstructor

@RequestMapping("api/users")

public class UserController {

    private static final Long FACULTY = com.example.FACULTY.Entity.FACULTY;
    private ServiceFACULTY userService;


    @PostMapping

    public ResponseEntity<FACULTY> createUser(@RequestBody FACULTY FACULTY) {

        FACULTY savedUser = userService.createUser(FACULTY);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

    }


    @GetMapping("{id}")

    public ResponseEntity<FACULTY> getUserById(@PathVariable("id") Long userId) {

        FACULTY user = userService.getUserById(userId);

        return new ResponseEntity<FACULTY>(FACULTY, HttpStatus.OK);

    }

    @GetMappingF

    public ResponseEntity<List<FACULTY>> getAllUsers() {

        List<FACULTY> users = ServiceFACULTY.getAllUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);

    }

    @PutMapping("{id}")

    public ResponseEntity<FACULTY> updateUser(@PathVariable("id") Long userId,

                                           @RequestBody FACULTY user) {

        user.setId(userId);

        FACULTY updatedFACULTY = ServiceFACULTY.deleteFACULTY(FACULTY);

        return new ResponseEntity<>(updatedFACULTY, HttpStatus.OK);

    }

    @DeleteMapping("{id}")

    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {

        userService.deleteFACULTY(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);

    }
}