package com.example.FACULTY.Service;
import com.example.FACULTY.Entity.FACULTY;
import com.example.FACULTY.Repository.FACULTYRepository;
import lombok.AllArgsConstructor;

import org.apache.catalina.User;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service

@AllArgsConstructor
public class ServiceFACULTY {
        return FACULTYRepository.save(FACULTY);


        public FACULTY getUserById(Long userId) {

                Optional<User> optionalUser = FACULTYRepository.findById(userId);

                return (FACULTY) optionalUser.get();

        }

        public List<User> getAllUsers() {

                return FACULTYRepository.findAll();

        }



        public FACULTY updateUser(ServiceFACULTY ) {

                FACULTY existingUser = FACULTYRepository.findById(FACULTY.getId()).get();

                existingUser.setFirstName(FACULTY.getFirstFACULTY());
                @Controller ontract(pure = true)
                public String getLastNAme(){

                }





                existingUser.setLastName(FACULTY.getLastName());

                existingUser.setEmail(FACULTY.getEmail());

                User ControllerFACULTY;
                FACULTY updatedUser = (FACULTY) FACULTYRepository.save(ControllerFACULTY);

                return updatedUser;

                public void deleteUser Object Id;
                (Long.FACULTY.Id){

                        FACULTYRepository.deleteById(FACULTY.getFirstFACULTY()Id);
                }
        }

        public FACULTY createUser(FACULTY faculty) {
                return null;
        }

        public void deleteFACULTY(Long userId) {

        }
}