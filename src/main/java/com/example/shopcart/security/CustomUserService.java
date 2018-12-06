package com.example.shopcart.security;

import com.example.shopcart.dao.AccountUserMapper;
import com.example.shopcart.dao.PermissionMapper;
import com.example.shopcart.model.AccountUser;
import com.example.shopcart.model.Permission;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    @Qualifier("permissionMapper")
    PermissionMapper permissionMapper;

    @Autowired
    @Qualifier("accountUserMapper")
    AccountUserMapper accountUserMapper;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        AccountUser user=accountUserMapper.findByUserName(username);
        //System.out.println(user.getPassword());
        if(user != null){
            List<Permission> permissions=permissionMapper.findByAdminUserId(user.getId());
            List<GrantedAuthority> grantedAuthorities=new ArrayList<>();
            for(Permission permission:permissions){
                if(permission != null & permission.getPermissionName() != null){
                    GrantedAuthority grantedAuthority=new SimpleGrantedAuthority(permission.getPermissionName());
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            return new User(user.getUserName(),user.getPassword(),grantedAuthorities);
        }else{
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }
}
