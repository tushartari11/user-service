package com.telefonica.prepaid.userinfo.mapper;

import com.telefonica.prepaid.userinfo.dto.UserDTO;
import com.telefonica.prepaid.userinfo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserToUserDTO(User user);

}