package com.eureka.mindbloom.auth.dto;

import com.eureka.mindbloom.member.domain.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public record MemberDetails(Member member) implements UserDetails {



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String roleCode = member.getRole();
        String authority = roleCode.equals("0400_01") ? "ROLE_Admin" : "ROLE_User";
        return List.of(new SimpleGrantedAuthority(authority));
    }
    @Override
    public String getPassword() {
        return member.getPassword();
    }

    @Override
    public String getUsername() {
        return member.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
