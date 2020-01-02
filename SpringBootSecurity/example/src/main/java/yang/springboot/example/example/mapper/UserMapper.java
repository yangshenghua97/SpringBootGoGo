package yang.springboot.example.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import yang.springboot.example.example.entry.Role;
import yang.springboot.example.example.entry.User;

import java.util.List;
@Mapper
public interface UserMapper {
    User loadUserByUserName(String username);
    List<Role> getUserRoleByUid(Integer id);
}
