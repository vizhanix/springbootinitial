package com.example.second.security;

import com.example.second.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.example.second.entities.User;
import org.springframework.stereotype.Service;

//@Service
//public class MyUserDetailsService implements UserDetailsService{
//
//    @Autowired
//    private UserRepository userRepo;
//    
//    @Override
//    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
//        
//        User user = userRepo.findByUsername(string);
//        if(user==null){
//            throw new UsernameNotFoundException("USER NOT FOUND - 404");
//        }
//        return new UserPrincipal(user);
//    }
//    
//}
