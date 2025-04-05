package com.sahajanand.java_21_gradle_k_jar.model;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {

  //  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  void updateUserFromDto(User source, @MappingTarget User target);
}
